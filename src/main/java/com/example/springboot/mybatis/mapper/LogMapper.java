package com.example.springboot.mybatis.mapper;

import com.example.springboot.mybatis.entity.Log;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogMapper {

    void insert(Log entity);

    List<Log> get();
}
