package com.fjg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fjg.model.Fuser;
import com.fjg.service.FuserService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/testSpring")
public class FuserController {

	@Autowired
	private FuserService fuserserv;
	
	@RequestMapping(value = "/add",produces= {"application/json;charset=UTF-8"})
	public int addFuser(Fuser fu) {
		return fuserserv.addFuser(fu);
	}
//1、PathVariable注解示例
//	@ResponseBody
//	@RequestMapping(value="/find/{id}")
//	public Fuser findFuserByKey( @PathVariable int id) {
//		return fuserserv.findFuserByKey(id);
//	}
	
//2、RequestParam注解示例
	@ResponseBody
	@RequestMapping(value="/find")
	public Fuser findFuserByKey( @RequestParam int id) {
		return fuserserv.findFuserByKey(id);
	}
	@ResponseBody
	@RequestMapping(value="/del")
	public String delFuserByKey(@RequestParam int id) {
		fuserserv.delFuserByKey(id);
		return "删除成功";
	}
	@RequestMapping(value="/update")
	@ResponseBody
	public int updateFuserByKey(Fuser fu) {
		return fuserserv.updateFuserByKey(fu);
	}
	
//1、	使用mabatis分页插件
	@RequestMapping(value="/findAll")
	@ResponseBody
//	public List<Fuser> findAllFuser(@RequestParam int pageNum,@RequestParam int pageSize){
//		return fuserserv.findAllFuser(pageNum,pageSize);
//	}
	
//2、	使用PageInfo工具类
	public PageInfo<Fuser> findAllFuser(@RequestParam int pageNum,@RequestParam int pageSize){
		System.out.println(fuserserv.findAllFuser(pageNum,pageSize).getList());
		return fuserserv.findAllFuser(pageNum,pageSize);
	}
	
//	@ResponseBody
	@RequestMapping("/hello")
	public String hello() {
		return "user";
	}
	
}
