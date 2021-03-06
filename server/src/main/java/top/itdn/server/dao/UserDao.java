package top.itdn.server.dao;

import top.itdn.server.entity.User;
import org.apache.ibatis.annotations.Mapper;
import top.itdn.server.entity.UserVo;

import java.util.List;
import java.util.Set;

/**
 * Description
 *
 * @author : Charles
 * @date : 2020/1/17
 */
@Mapper
public interface UserDao {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    UserVo selectVoByPrimaryKey(Integer id);

    List<UserVo> selectAll();

    Set<String> selectPermissionByRoleid(Integer roleid);

    Set<String> selectRolesByRoleid(Integer id);
}
