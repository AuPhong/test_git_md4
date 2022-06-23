package com.codegym.castudymd6final.model.dto;

import com.codegym.castudymd6final.model.entity.Category;
import com.codegym.castudymd6final.model.entity.User;
import com.codegym.castudymd6final.model.entity.Wallet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransactionDTO {
    private int amount;

    private String note;

    private Date date;

    private Category category;

    private String moneyType;
}
