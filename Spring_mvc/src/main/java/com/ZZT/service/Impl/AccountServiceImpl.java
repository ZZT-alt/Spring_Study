package com.ZZT.service.Impl;

import com.ZZT.Dao.BrandDao;

import com.ZZT.service.AccountService;

public class AccountServiceImpl implements AccountService {
    private BrandDao brandDao;

    public BrandDao getBrandDao() {
        return brandDao;
    }

    public void setBrandDao(BrandDao brandDao) {
        this.brandDao = brandDao;
    }

    @Override
    public void transfer(String in_name, String out_name, int total) {
        brandDao.out(out_name, total);
        //int i = 1 / 0;
        brandDao.in(in_name, total);
    }
}
