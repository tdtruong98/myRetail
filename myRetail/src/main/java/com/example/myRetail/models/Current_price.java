package com.example.myRetail.models;

import com.example.myRetail.models.CurrencyCodes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document
@AllArgsConstructor
public class Current_price {
    @Id
    private int id;
    private BigDecimal value;
    private CurrencyCodes currency_code;

    @JsonIgnore
    public int getId() {
        return id;
    }
}
