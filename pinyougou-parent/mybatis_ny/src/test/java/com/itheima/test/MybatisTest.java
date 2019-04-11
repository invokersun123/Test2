package com.itheima.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author ghy
 */
public class MybatisTest {

    /*private InputStream in;
    private SqlSessionFactory factory;
    private SqlSession session;
    private MyUserMapper userMapper;

    @Before
    public  void init()throws Exception{
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        factory = new SqlSessionFactoryBuilder().build(in);
        session = factory.openSession();
        userMapper = session.getMapper(MyUserMapper.class);
    }

    @After
    public  void destroy()throws  Exception{
        session.commit();
        session.close();
        in.close();
    }


    *//**
     * 测试查询所有
     *//*
    @Test
    public void testSelectByExample(){
        List<MyUser> list = userMapper.selectByExample(null);
        for (MyUser myUser : list) {
            System.out.println(myUser);
        }
    }

    *//**
     * 测试条件查询
     *//*
    @Test
    public void testSelectByExample2(){
        MyUserExample example = new MyUserExample();
        MyUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameLike("%王%");
        criteria.andSexEqualTo("女");
        criteria.andIdIn(Arrays.asList(42,43));
        List<MyUser> list = userMapper.selectByExample(example);
        for (MyUser myUser : list) {
            System.out.println(myUser);
        }
    }

    *//**
     * 测试主键查询
     *//*
    @Test
    public void testSelectByPrimaryKey(){
        MyUser user = userMapper.selectByPrimaryKey(41);
        System.out.println(user);
    }

    
    *//**
     * 测试增加
     *//*
    @Test
    public void testInsert(){
        MyUser user = new MyUser();
        user.setUsername("我来测试增加2");
        user.setBirthday(new Date());
//        int count = userMapper.insertSelective(user);
        int count = userMapper.insert(user);
        System.out.println(count);
    }

    *//**
     * 测试修改
     *//*
    @Test
    public void testUpdate(){
        MyUser user = userMapper.selectByPrimaryKey(76);
        user.setAddress("成都");
        user.setUsername("赵雷");
        userMapper.updateByPrimaryKey(user);
    }
    
    *//**
     * 测试删除
     *//*
    @Test
    public void test(){
        MyUserExample example = new MyUserExample();
        MyUserExample.Criteria criteria = example.createCriteria();
        criteria.andBirthdayBetween(java.sql.Date.valueOf("2000-01-01"),java.sql.Date.valueOf("2000-12-31"));
        int count = userMapper.deleteByExample(example);
        System.out.println(count);//10
    }*/
    
}
