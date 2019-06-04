package com.yang.middleware.main;

import com.yang.middleware.bean.User;
import com.yang.middleware.dao.UserMapper;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.util.List;

public class MybatisMain {
    private String driverName = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/test";
    private String username = "root";
    private String password = "admin";
 
 
    public static void main(String[] args) {
        MybatisMain mybatis =new MybatisMain();
        SqlSessionFactory sqlSessionFactory = mybatis.initMybatis();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userMapper.getAllUser();
        for (User userItem : userList) {
            System.out.println(userItem);
        }
    }
 
    /**
     * 初始化mybatis,并返回sqlSessionFactory
     */
    private SqlSessionFactory initMybatis() {
        DataSource dataSource = initDataSourceWithReturn();
        TransactionFactory transactionFactory = new JdbcTransactionFactory();
        Environment environment = new Environment("justForTest", transactionFactory, dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.getTypeAliasRegistry().registerAlias("user", User.class);//注册别名
        configuration.addMapper(UserMapper.class);//添加mapper
        return new DefaultSqlSessionFactory(configuration);
    }
 
 
    /**
     * 初始化并获取dataSource
     *
     * @return DataSource
     */
    private DataSource initDataSourceWithReturn() {
        PooledDataSource dataSource = new PooledDataSource();
        dataSource.setUrl(url);
        dataSource.setDriver(driverName);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
 
}
