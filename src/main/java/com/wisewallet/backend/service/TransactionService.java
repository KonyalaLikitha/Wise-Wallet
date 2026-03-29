package com.wisewallet.backend.service;

import java.util.List;
import com.wisewallet.backend.entity.Transaction;

public interface TransactionService {

    Transaction createTransaction(Transaction transaction);

    List<Transaction> getAllTransactions();
}