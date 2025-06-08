package com.sv.vardhanschool.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sv.vardhanschool.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
