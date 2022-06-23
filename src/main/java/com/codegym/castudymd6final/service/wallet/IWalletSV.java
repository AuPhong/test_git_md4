package com.codegym.castudymd6final.service.wallet;

import com.codegym.castudymd6final.model.dto.SumMoney;
import com.codegym.castudymd6final.model.entity.AddMoney;
import com.codegym.castudymd6final.model.entity.Transaction;
import com.codegym.castudymd6final.model.entity.Wallet;
import com.codegym.castudymd6final.service.IGeneralService;

import java.util.Date;
import java.util.List;

public interface IWalletSV extends IGeneralService<Wallet> {
    List<Wallet> getWalletByUserId(Long userId);
    void deleteWallet(Long wallet_id);

}
