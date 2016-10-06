package com.tneciv.dockerboot.mapper;

import com.tneciv.dockerboot.entity.Boot;
import com.tneciv.dockerboot.entity.BootExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface BootMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @SelectProvider(type=BootSqlProvider.class, method="countByExample")
    long countByExample(BootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @DeleteProvider(type=BootSqlProvider.class, method="deleteByExample")
    int deleteByExample(BootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @Delete({
        "delete from boot",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @Insert({
        "insert into boot (id, boot, ",
        "name, description, ",
        "memo_rest)",
        "values (#{id,jdbcType=INTEGER}, #{boot,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{memoRest,jdbcType=VARCHAR})"
    })
    int insert(Boot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @InsertProvider(type=BootSqlProvider.class, method="insertSelective")
    int insertSelective(Boot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @SelectProvider(type=BootSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="boot", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="memo_rest", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Boot> selectByExample(BootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, boot, name, description, memo_rest",
        "from boot",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ConstructorArgs({
        @Arg(column="id", javaType=Integer.class, jdbcType=JdbcType.INTEGER, id=true),
        @Arg(column="boot", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="name", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="description", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="memo_rest", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Boot selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BootSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Boot record, @Param("example") BootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BootSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Boot record, @Param("example") BootExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BootSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Boot record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boot
     *
     * @mbg.generated
     */
    @Update({
        "update boot",
        "set boot = #{boot,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "memo_rest = #{memoRest,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Boot record);
}