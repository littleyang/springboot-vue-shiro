package top.itdn.server.dao;

import org.apache.ibatis.annotations.Mapper;
import top.itdn.server.entity.User;

import java.util.Set;

@Mapper
public interface SysDao {
    int insertSelective(User record);

    User selectByAccount(String account);

    String getRoleByRoleid(Integer roleid);

    Set<String> getPermissionsByRoleid(Integer roleid);
}