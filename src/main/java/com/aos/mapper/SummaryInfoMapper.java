package com.aos.mapper;

import com.aos.pojo.SummaryInfo;
import com.aos.pojo.SummaryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SummaryInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int countByExample(SummaryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int deleteByExample(SummaryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int insert(SummaryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int insertSelective(SummaryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    List<SummaryInfo> selectByExampleWithBLOBs(SummaryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    List<SummaryInfo> selectByExample(SummaryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    SummaryInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByExampleSelective(@Param("record") SummaryInfo record, @Param("example") SummaryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByExampleWithBLOBs(@Param("record") SummaryInfo record, @Param("example") SummaryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByExample(@Param("record") SummaryInfo record, @Param("example") SummaryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByPrimaryKeySelective(SummaryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByPrimaryKeyWithBLOBs(SummaryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table summary_info
     *
     * @mbggenerated Sun Nov 24 10:03:46 CST 2024
     */
    int updateByPrimaryKey(SummaryInfo record);
}