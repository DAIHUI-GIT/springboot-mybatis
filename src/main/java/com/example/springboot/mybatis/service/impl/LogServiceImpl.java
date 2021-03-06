package com.example.springboot.mybatis.service.impl;

import com.example.springboot.mybatis.entity.Log;
import com.example.springboot.mybatis.mapper.LogMapper;
import com.example.springboot.mybatis.service.LogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogServiceImpl implements LogService {

    @Resource
    LogMapper logMapper;

    @Override
    public List<Log> get() throws Exception {
        return logMapper.get();
    }

}
