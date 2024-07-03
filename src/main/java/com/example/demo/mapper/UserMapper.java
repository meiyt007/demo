package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;

public interface UserMapper {

    /**
     * @description
     * @param
     * @author meiyt
     * @date 2024/7/1
     * @return
     **/
    User getUserById(long userId);
}
