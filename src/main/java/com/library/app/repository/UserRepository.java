package com.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.app.model.UserModel;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

	// this is used for login
	public List<UserModel> findByEmailAndPassword(String email, String password);

}
