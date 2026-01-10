package com.wisewallet.backend.repository;

import com.wisewallet.backend.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface BudgetRepository extends JpaRepository<Budget, Long> {
    Optional<Budget> findByUserId(Long userId);
}
