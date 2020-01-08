package com.fjg.dao;

import com.fjg.model.Empee;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface EmpeeMapper {
    int deleteByPrimaryKey(String username);

    int insert(Empee record);

    Empee selectByPrimaryKey(String username);

    List<Empee> selectAll();

    int updateByPrimaryKey(Empee record);
}