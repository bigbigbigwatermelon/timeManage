package service.imp;

import main.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.IUserLoginService;

import java.util.Map;

@Service
public class UserLoginServiceImp implements IUserLoginService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Map queryUserInfo(Map<String, String> parms) {
        return userMapper.queryUserInfo(parms);
    }

    @Override
    public void insertUserInfo(Map<String, Object> params) {
        userMapper.insertUserInfo(params);
    }

    @Override
    public boolean updateUserInfo(Map<String, String> params) {
        return userMapper.updateUserInfo(params);
    }
}
