package com.jb.SpringBootDTO.repositories;

import com.jb.SpringBootDTO.entities.Human;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HumanRepository extends JpaRepository<Human, Long> {
}
