package com.example.persistence;

import com.example.business.Inventory;
import com.example.business.InventoryRequestDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByNameIn(List<InventoryRequestDto> names);

    Optional<Inventory> findByName(String name);
}
