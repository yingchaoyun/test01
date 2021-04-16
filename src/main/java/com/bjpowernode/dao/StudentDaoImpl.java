package com.bjpowernode.dao;

import com.bjpowernode.entity.Student;
import com.bjpowernode.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudents() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        String  sqlId = "com.bjpowernode.dao.StudentDao.selectStudents";
        //执行sql
        List<Student> students = sqlSession.selectList(sqlId);
        //关闭
        sqlSession.close();
        return students;
    }
}
