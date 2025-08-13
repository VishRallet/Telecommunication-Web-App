package com.project.Telecom.Repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Telecom.Entity.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<User,Long> {
	

}
