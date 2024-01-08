package com.example.springboot_login.service;

import com.example.springboot_login.entity.Members;
import com.example.springboot_login.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MembersService {

    private MembersRepository membersRepository;

    @Autowired
    MembersService(MembersRepository membersRepository) {
        this.membersRepository = membersRepository;
    }

    public boolean checkUsername(String username) {
        Members mem = membersRepository.findByUsername(username);
        if (mem != null) {
            return true;
        }
        return false;
    }
}
