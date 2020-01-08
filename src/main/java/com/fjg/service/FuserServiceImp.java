package com.fjg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fjg.dao.FuserMapper;
import com.fjg.model.Fuser;
import com.fjg.service.FuserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("fuserserv")
public class FuserServiceImp implements FuserService {

	@Autowired
	private FuserMapper fusermapper;
	
	public int addFuser(Fuser fu) {
		// TODO Auto-generated method stub
		return fusermapper.insert(fu);
	}

	public Fuser findFuserByKey(int id) {
		// TODO Auto-generated method stub
		return fusermapper.selectByPrimaryKey(id);
	}

	public int delFuserByKey(int id) {
		// TODO Auto-generated method stub
		return fusermapper.deleteByPrimaryKey(id);
	}

	public int updateFuserByKey(Fuser fu) {
		// TODO Auto-generated method stub
		return fusermapper.updateByPrimaryKey(fu);
	}
//	public List<Fuser> findAllFuser(int pageNum, int pageSize) {
//		// TODO Auto-generated method stub
//		PageHelper.startPage(pageNum,pageSize);
//		return fusermapper.selectAll();
//	}
	
//	使用PageInfo工具类
	public PageInfo<Fuser> findAllFuser(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		List<Fuser> list = fusermapper.selectAll();
		PageInfo<Fuser> pageinfo = new PageInfo<Fuser>(list);
		return pageinfo;
	}

}
