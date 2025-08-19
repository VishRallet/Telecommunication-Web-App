package com.project.Telecom.Repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.Telecom.Entity.Recharge;

@Repository
@EnableJpaRepositories
public interface RechargeRepository extends CrudRepository<Recharge,Long> {
	

}
