package com.stashon.primavera_financial.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/*
transactionId (Long), sourceAccountId (Long), targetAccountId (Long), amount (BigDecimal), 
status (String), timestamp (LocalDateTime), sourceNewBalance (BigDecimal)

server output, so no validation annotations
 */


public class TransferResponse {
    
    private Long transactionId;
    private Long sourceAccountId;
    private Long targetAccountId;
    private BigDecimal amount;
    private String status;
    private LocalDateTime timestamp;
    private BigDecimal sourceNewBalance;


    // CONSTRUCTORS
    public TransferResponse(){}

    public TransferResponse(Long transactionId, Long sourceAccountId, Long targetAccountId, BigDecimal amount, String status, LocalDateTime timestamp, BigDecimal sourceNewBalance){
        this.transactionId = transactionId;
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.amount = amount;
        this.status = status;
        this.timestamp = timestamp;
        this.sourceNewBalance = sourceNewBalance;
    }

    // GETTERS & SETTERS
    public Long getTransactionId(){return transactionId;}
    public void setTransactionId(Long transactionId){this.transactionId = transactionId;}

    public Long getSourceAccountId(){return sourceAccountId;}
    public void setSourceAccountId(Long sourceAccountId){this.sourceAccountId = sourceAccountId;}

    public Long getTargetAccountId(){return targetAccountId;}
    public void setTargetAccountId(Long targetAccountId){this.targetAccountId = targetAccountId;}

    public BigDecimal getAmount(){return amount;}
    public void setAmount(BigDecimal amount){this.amount = amount;}

    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}

    public LocalDateTime getTimestamp(){return timestamp;}
    public void setTimestamp(LocalDateTime timestamp){this.timestamp = timestamp;}

    public BigDecimal getSourceNewBalance(){return sourceNewBalance;}
    public void setSourceNewBalance(BigDecimal sourceNewBalance){this.sourceNewBalance = sourceNewBalance;}
}
