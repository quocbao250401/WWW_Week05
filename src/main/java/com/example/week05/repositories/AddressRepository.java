package com.example.week05.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.week05.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
