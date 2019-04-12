package com.xingze.controller;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xingze.bean.student;
import com.xingze.bean.teacher;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String hello()
	{
		return "hello";	
	}
	
	@RequestMapping("/studentLogin")
	public String studentLogin(student student)
	{
		//创建Session实例
		SqlSession sqlSession =null;
		//try语句里读取MybatisCfg.xml文件
		try(InputStream is=Resources.getResourceAsStream("MybatisCfg.xml");)
		{
			//初始化mybatis，创建SqlSessionFactory类的实例
			SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
			sqlSession=sqlSessionFactory.openSession();
			//创建students对象
			student ss=new student("123456789","王王王","男","123456789","666666");
			//插入数据
			sqlSession.insert("com.xingze.mapper.studentMapper.studentLogin",ss);
			//提交事务
			sqlSession.commit();
		}catch(Exception e)
		{
			//回滚事务
			sqlSession.rollback();
			e.printStackTrace();
			return "false";
			
		}finally
		{
			try {
				//关闭sqlSession
				if(sqlSession!=null)  sqlSession.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return "index";
	}

	
	@RequestMapping("/teacherLogin")
	public String teacherLogin(teacher teacher)
	{
		//创建Session实例
		SqlSession sqlSession =null;
		//try语句里读取MybatisCfg.xml文件
		try(InputStream is=Resources.getResourceAsStream("MybatisCfg.xml");)
		{
			//初始化mybatis，创建SqlSessionFactory类的实例
			SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
			sqlSession=sqlSessionFactory.openSession();
			//创建teacher对象
			teacher ss=new teacher("153645","王王王","1569874563","456789");
			//插入数据
			sqlSession.insert("com.xingze.mapper.teacherMapper.teacherLogin",ss);
			//提交事务
			sqlSession.commit();
		}catch(Exception e)
		{
			//回滚事务
			sqlSession.rollback();
			e.printStackTrace();
			return "false";
			
		}finally
		{
			try {
				//关闭sqlSession
				if(sqlSession!=null)  sqlSession.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return "index";
	}
	
}
