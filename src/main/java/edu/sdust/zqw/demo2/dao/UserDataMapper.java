package edu.sdust.zqw.demo2.dao;

import edu.sdust.zqw.demo2.model.UserData;
import edu.sdust.zqw.demo2.model.UserDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDataMapper {
    long countByExample(UserDataExample example);

    int deleteByExample(UserDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserData record);

    int insertSelective(UserData record);

    List<UserData> selectByExample(UserDataExample example);

    UserData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserData record, @Param("example") UserDataExample example);

    int updateByExample(@Param("record") UserData record, @Param("example") UserDataExample example);

    int updateByPrimaryKeySelective(UserData record);

    int updateByPrimaryKey(UserData record);
}