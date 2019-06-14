package com.shineyue.testone.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import com.shineyue.testone.result.MarketFrStatV;
/**
 * 持久层接口
 * @author HUAWEI
 *
 */
public interface MarketFrStatVDao {
//	@Select("<script>select userid,username,age from test</script>")
//    @Results({
//            @Result(property = "id",  column = "userid"),
//            @Result(property = "name", column = "username"),
//            @Result(property = "age", column = "age")
//    })
	@SelectProvider(type = GetUser.class,method = "getUser")
	MarketFrStatV getOne(@Param("userid")Integer userid);

}
