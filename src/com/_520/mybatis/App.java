package com._520.mybatis;


import com._520.mybatis.mapper.Department;
import com._520.mybatis.mapper.DepartmentMapper;
import com._520.mybatis.mapper.Employee;
import com._520.mybatis.mapper.EmployeeMapper;
import com._520.mybatis.util.MybatisUtil;
import org.junit.Test;

import java.util.List;

public class App {

    @Test
    public void save(){
        EmployeeMapper employeeMapper = MybatisUtil.getMapper(EmployeeMapper.class);
        DepartmentMapper departmentMapper = MybatisUtil.getMapper(DepartmentMapper.class);

        Employee employee = new Employee();
        Department department = new Department();

        //先添加部门
        department.setName("开发部");
        //添加员工
        employee.setName("露露");
        employee.setDept(department);
        Employee employee1 = new Employee();
        employee1.setName("小法");
        employee1.setDept(department);

        departmentMapper.save(department);
        employeeMapper.save(employee);
        employeeMapper.save(employee1);
    }

    @Test
    public void get(){
        EmployeeMapper employeeMapper = MybatisUtil.getMapper(EmployeeMapper.class);
        //获取指定id的员工
        Employee employee = employeeMapper.get(6L);
        System.out.println(employee.toString());
        //System.out.println(employee.getDept());
    }
    @Test
    public void listAll(){
        EmployeeMapper employeeMapper = MybatisUtil.getMapper(EmployeeMapper.class);
        List<Employee> list = employeeMapper.listAll();
        for ( Employee e:list
             ) {
            System.out.println(e);
        }
    }
}
