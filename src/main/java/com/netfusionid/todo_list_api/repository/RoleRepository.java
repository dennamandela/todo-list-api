package com.netfusionid.todo_list_api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netfusionid.todo_list_api.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);
}
