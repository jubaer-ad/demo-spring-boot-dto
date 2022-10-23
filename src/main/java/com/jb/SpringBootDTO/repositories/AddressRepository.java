package com.jb.SpringBootDTO.repositories;

import com.jb.SpringBootDTO.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
