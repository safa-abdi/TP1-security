package com.safa.users.service;
import com.safa.users.entities.Role;
import com.safa.users.entities.User;
public interface UserService {
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}