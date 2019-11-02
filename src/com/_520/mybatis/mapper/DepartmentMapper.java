package com._520.mybatis.mapper;

public interface DepartmentMapper {
    void save(Department department);

    Department get(long id);
}
