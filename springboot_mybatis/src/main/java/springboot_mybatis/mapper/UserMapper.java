package springboot_mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import springboot_mybatis.domain.User;
import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> queryUserList();
}
