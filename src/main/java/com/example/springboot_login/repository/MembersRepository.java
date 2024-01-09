package com.example.springboot_login.repository;

import com.example.springboot_login.entity.Members;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembersRepository extends CrudRepository<Members, Integer> {

    Members findByUsername(String username);
}
