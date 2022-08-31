package com.ZZT.service;

import com.ZZT.domain.Brand;

import java.util.List;

public interface BrandService {
    public void save(Brand brand);

    public List<Brand> find_all();
}
