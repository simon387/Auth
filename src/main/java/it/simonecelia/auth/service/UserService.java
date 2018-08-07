package it.simonecelia.auth.service;

import it.simonecelia.auth.model.User;

public interface UserService {

	void save(User user);

	User findByUsername(String username);
}
