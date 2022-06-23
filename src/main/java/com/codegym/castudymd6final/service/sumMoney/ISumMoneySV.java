package com.codegym.castudymd6final.service.sumMoney;

import com.codegym.castudymd6final.model.dto.SumMoney;
import com.codegym.castudymd6final.service.IGeneralService;

import java.util.List;

public interface ISumMoneySV extends IGeneralService<SumMoney> {
    List<SumMoney> getSumMoney(Long user_id);
}
