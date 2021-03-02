package com.luminis.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerStatement {
    Long transactionReference;
    String accountNumber;
    BigDecimal startBalance;
    BigDecimal mutation;
    String description;
    BigDecimal endBalance;
}
