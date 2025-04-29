package com.library.app.service;

import java.util.List;

import com.library.app.model.UserModel;

public interface UserService {
	public UserModel createNewUser(UserModel model);

	public UserModel updateUser(UserModel model);

	public UserModel deleteUser(Integer id);

	public UserModel viewOneUser(Integer id);

	public List<UserModel> viewAllUsers();

	public UserModel loginUser(UserModel model);
}
