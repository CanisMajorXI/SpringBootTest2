package edu.sdust.zqw.demo2.sevice;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import edu.sdust.zqw.demo2.model.UserDataExample;
import edu.sdust.zqw.demo2.model.UserData;
import edu.sdust.zqw.demo2.dao.UserDataMapper;
@Service
public class UserDataService{

    @Resource
    private UserDataMapper userDataMapper;

    public long countByExample(UserDataExample example){
        return userDataMapper.countByExample(example);
    }

    public int deleteByExample(UserDataExample example){
        return userDataMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id){
        return userDataMapper.deleteByPrimaryKey(id);
    }

    public int insert(UserData record){
        return userDataMapper.insert(record);
    }

    public int insertSelective(UserData record){
        return userDataMapper.insertSelective(record);
    }

    public List<UserData> selectByExample(UserDataExample example){
        return userDataMapper.selectByExample(example);
    }

    public UserData selectByPrimaryKey(Integer id){
        return userDataMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(UserData record,UserDataExample example){
        return userDataMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(UserData record,UserDataExample example){
        return userDataMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(UserData record){
        return userDataMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserData record){
        return userDataMapper.updateByPrimaryKey(record);
    }

}
