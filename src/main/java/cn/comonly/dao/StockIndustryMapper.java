package cn.comonly.dao;

import java.util.List;

import cn.comonly.pojo.StockIndustry;

public interface StockIndustryMapper {
	
	List<StockIndustry> getList();
	
    int deleteByPrimaryKey(Integer iid);

    int insert(StockIndustry record);

    int insertSelective(StockIndustry record);

    StockIndustry selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(StockIndustry record);

    int updateByPrimaryKey(StockIndustry record);
}