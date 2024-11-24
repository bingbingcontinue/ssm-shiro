package com.aos.mapper;

import com.aos.pojo.SysUser;
import com.aos.pojo.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysUserMapper {
    SysUser findByUsername(String username);
    void update(String username, String password);
    void register(String username, String password);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int countByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int deleteByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int insert(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int insertSelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    SysUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByPrimaryKey(SysUser record);
}