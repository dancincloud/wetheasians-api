package com.wetheasians.api.repository;

import com.wetheasians.api.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Joseph Yuanhao Li
 * @date 8/18/21 1:17 AM
 */
public interface UserRepository extends CrudRepository<User, Integer> {

}
