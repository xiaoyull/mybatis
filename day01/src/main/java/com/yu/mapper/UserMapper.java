package com.yu.mapper;

import com.yu.pojo.User;

import java.util.List;

/**
 * @author 小鱼
 * @version 1.0
 * @date 2020/11/18 11:57 下午
 */
public interface UserMapper {

    /**
     *查询所有的user数据
     * @return
     */
    public List<User> getUserListByUser();

    /**
     * 根据ID查询user数据
     * @param id
     * @return
     */
    public User getUserOne(int id);

    /**
     * 增加数据
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 修改user数据
     * @param user
     * @return
     */
    public int updateUser(User user);

    /**
     * 根据ID删除数据
     * @param id
     * @return
     */
    public int deleteUser(int id);
}
