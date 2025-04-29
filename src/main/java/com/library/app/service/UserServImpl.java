package com.library.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.app.model.UserModel;
import com.library.app.repository.UserRepository;

@Service
public class UserServImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserModel createNewUser(UserModel model) {
		model.setUtype("user");
		return userRepository.save(model);
	}

	@Override
	public UserModel updateUser(UserModel model) {
		Optional<UserModel> op = userRepository.findById(model.getId());
		if (op.isPresent()) {
			return userRepository.save(model);
		}
		return new UserModel();
	}

	@Override
	public UserModel deleteUser(Integer id) {
		Optional<UserModel> op = userRepository.findById(id);
		if (op.isPresent()) {
			userRepository.deleteById(id);
			return op.get();
		}
		return new UserModel();
	}

	@Override
	public UserModel viewOneUser(Integer id) {
		Optional<UserModel> op = userRepository.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return new UserModel();
	}

	@Override
	public List<UserModel> viewAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public UserModel loginUser(UserModel model) {
		List<UserModel> uList = userRepository.findByEmailAndPassword(model.getEmail(), model.getPassword());
		if (uList.isEmpty()) {
			return new UserModel();
		}
		return uList.get(0);
	}

}
