package com.hello.mapper;

import com.hello.model.Farmer;
import java.util.List;

public interface FarmerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table farmer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table farmer
     *
     * @mbg.generated
     */
    int insert(Farmer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table farmer
     *
     * @mbg.generated
     */
    Farmer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table farmer
     *
     * @mbg.generated
     */
    List<Farmer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table farmer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Farmer record);
}