package com.wisewallet.backend.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wisewallet.backend.entity.Transaction;
import com.wisewallet.backend.repository.TransactionRepository;
import com.wisewallet.backend.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }
}