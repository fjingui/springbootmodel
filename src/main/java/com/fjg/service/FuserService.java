package com.fjg.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fjg.model.Fuser;
import com.github.pagehelper.PageInfo;


public interface FuserService {

	int addFuser(Fuser fu);
    Fuser findFuserByKey(int id );
	int delFuserByKey(int id );
	int updateFuserByKey(Fuser fu);
//	 使用分页插件
//	List<Fuser> findAllFuser(int pageNum, int pageSize);
	
//	使用PageInfo工具类
	PageInfo<Fuser> findAllFuser(int pageNum, int pageSize);
}
