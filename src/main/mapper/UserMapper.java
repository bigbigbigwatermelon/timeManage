package main.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;


    @Repository
    public interface UserMapper {
        /*
         * 查询用户信息
         */
        public Map<String, Object> queryUserInfo(Map<String,String> params);

        /*
         * 更新用户信息
         */
        public boolean updateUserInfo(Map<String,String> params);

        /*
         * 增加用户信息
         */
        public void insertUserInfo(Map<String, Object> params);

    }

