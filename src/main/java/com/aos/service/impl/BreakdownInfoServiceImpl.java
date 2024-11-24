package com.aos.service.impl;

import com.aos.mapper.BreakdownInfoMapper;
import com.aos.pojo.BreakdownInfo;
import com.aos.service.BreakdownInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author：bingfeng
 * @Date：2024/11/24 16:10
 */

@Service
@Transactional
public class BreakdownInfoServiceImpl implements BreakdownInfoService {
    @Autowired
    private BreakdownInfoMapper breakdownInfoMapper;
    @Override
    public List<BreakdownInfo> getAllBreakdownInfo(){
        return breakdownInfoMapper.selectByExample(null);
    };

}
