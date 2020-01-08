package com.fjg.dao;

import com.fjg.model.Fuser;
import java.util.List;

public interface FuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Fuser record);

    Fuser selectByPrimaryKey(Integer id);

    List<Fuser> selectAll();

    int updateByPrimaryKey(Fuser record);
}