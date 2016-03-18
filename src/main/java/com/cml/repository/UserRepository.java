package com.cml.repository;

import com.cml.model.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/3/17.
 */
@Repository
public interface UserRepository extends JpaRepository<StudentEntity,Integer>{


}


