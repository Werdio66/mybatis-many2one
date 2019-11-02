package com._520.mybatis.mapper;

import java.util.List;

public interface EmployeeMapper {

    void save(Employee employee);

    Employee get(long id);

    List<Employee> listAll();
}
