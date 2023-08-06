package com.rafiul.springboot.repository;
import java.util.Optional;

import com.rafiul.springboot.models.ERole;
import com.rafiul.springboot.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}