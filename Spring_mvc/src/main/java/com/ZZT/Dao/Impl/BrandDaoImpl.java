package com.ZZT.Dao.Impl;

import com.ZZT.Dao.BrandDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class BrandDaoImpl implements BrandDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void in(String name, int total) {
        jdbcTemplate.update("update tb_brand set ordered = ordered + ? where brand_name = ?", total, name);
    }

    @Override
    public void out(String name, int total) {
        jdbcTemplate.update("update tb_brand set ordered = ordered - ? where brand_name = ?", total, name);
    }
}
