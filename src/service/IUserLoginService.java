package service;

import java.util.Map;

public interface IUserLoginService {

    public Map<String, Object> queryUserInfo(Map<String, String> reqData);

    public void insertUserInfo(Map<String, Object> params);

    public boolean updateUserInfo(Map<String, String > params);


}
