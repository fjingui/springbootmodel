package com.fjg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjg.dao.EmpeeMapper;
import com.fjg.model.Empee;
import com.fjg.model.Fuser;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class EmpeeServiceImp implements EmpeeService {

	@Autowired
	private EmpeeMapper empeemapper;
	
	public int addUser(Empee empee) {
		return empeemapper.insert(empee);
	}

	public PageInfo<Empee> findAllEmpee(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum,pageSize);
		List<Empee> list = empeemapper.selectAll();
		PageInfo<Empee> pageinfo = new PageInfo<Empee>(list);
		return pageinfo;
	}


	public int updateEmpeeByKey(Empee empee) {
		empeemapper.updateByPrimaryKey(empee);
		return 1;
	}

	public Empee findEmpeeByKey(String username) {
		
		return empeemapper.selectByPrimaryKey(username);
	}

	public int delEmpeeByKey(String username) {
		empeemapper.deleteByPrimaryKey(username);
		return 1;
	}


}
