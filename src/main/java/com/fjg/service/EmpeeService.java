package com.fjg.service;

import com.fjg.model.Empee;
import com.github.pagehelper.PageInfo;

public interface EmpeeService {

	int addUser(Empee empee);
	Empee findEmpeeByKey(String username);
	PageInfo<Empee> findAllEmpee(int pageNum, int pageSize);
	int updateEmpeeByKey(Empee empee );
	int delEmpeeByKey(String username );
}
