package com.toolrental.toolrental.repository;

import com.toolrental.toolrental.entity.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolRepository extends JpaRepository<Tool, String> {
}
