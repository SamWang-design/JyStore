package com.harry.jystore.service;


import com.harry.jystore.core.Service;
import com.harry.jystore.entity.User;

import java.util.List;

public interface UserService extends Service<User> {
  public List<User> findalls();
  public List<User> findallss();

}
