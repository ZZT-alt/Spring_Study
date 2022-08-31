package com.ZZT.mapper;

import com.ZZT.domain.Brand;

import java.util.List;

public interface BrandMapper {
    public void save(Brand brand);

    public List<Brand> find_all();
}
