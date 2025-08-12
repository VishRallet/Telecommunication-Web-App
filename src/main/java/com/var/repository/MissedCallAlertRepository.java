package com.var.repository;

import org.springframework.data.repository.CrudRepository;
import com.var.entity.MissedCallAlert;

public interface MissedCallAlertRepository extends CrudRepository<MissedCallAlert,Long>{

}
