package com.tnsif.placement.admin.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.placement.admin.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
