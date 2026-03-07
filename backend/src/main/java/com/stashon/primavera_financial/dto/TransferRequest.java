package com.stashon.primavera_financial.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


//sourceAccountId (Long), targetAccountId (Long), amount (BigDecimal)- not neg

public class TransferRequest {

    @NotNull(message = "Source Account Id is required")
    private Long sourceAccountId;

    @NotNull(message = "Target Account Id is required")
    private Long targetAccountId;

    @Positive(message = "Amount must be greater than zero")
    private BigDecimal amount;
    

    //CONSTRUCTORS
    public TransferRequest() {}

    public TransferRequest(Long sourceAccountId, Long targetAccountId, BigDecimal amount){
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.amount = amount;
    }

    //GETTERS & SETTERS
    public Long getSourceAccountId (){ return sourceAccountId; }
    public void setSourceAccountId (Long sourceAccountId){ this.sourceAccountId = sourceAccountId; }

    public Long getTargetAccountId (){ return targetAccountId; }
    public void setTargetAccountId (Long targetAccountId){ this.targetAccountId = targetAccountId; }

    public BigDecimal getAmount (){ return amount; }
    public void setAmount (BigDecimal amount){ this.amount = amount; }

}
