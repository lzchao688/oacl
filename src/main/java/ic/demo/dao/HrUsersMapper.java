package ic.demo.dao;

import ic.demo.entity.HrUsers;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface HrUsersMapper {
    int deleteByPrimaryKey(Integer uId);

    int insert(HrUsers record);

    HrUsers selectByPrimaryKey(Integer uId);

    List<HrUsers> selectAll();

    int updateByPrimaryKey(HrUsers record);
}