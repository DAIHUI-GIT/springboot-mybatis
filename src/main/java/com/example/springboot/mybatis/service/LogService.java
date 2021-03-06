package com.example.springboot.mybatis.service;

import com.example.springboot.mybatis.entity.Log;

import java.util.List;

public interface LogService {

    List<Log> get() throws Exception;

}
