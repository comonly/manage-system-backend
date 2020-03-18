package cn.comonly.dao;

import java.util.List;

import cn.comonly.pojo.StockIndividual;

public interface StockIndividualMapper {
	List<StockIndividual> getList();
	
    int deleteByPrimaryKey(Integer iid);

    int insert(StockIndividual record);

    int insertSelective(StockIndividual record);

    StockIndividual selectByPrimaryKey(Integer iid);

    int updateByPrimaryKeySelective(StockIndividual record);

    int updateByPrimaryKey(StockIndividual record);

}