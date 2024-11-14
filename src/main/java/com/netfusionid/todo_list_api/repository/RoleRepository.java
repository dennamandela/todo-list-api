package com.netfusionid.todo_list_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netfusionid.todo_list_api.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Role findByName(String name);
}
