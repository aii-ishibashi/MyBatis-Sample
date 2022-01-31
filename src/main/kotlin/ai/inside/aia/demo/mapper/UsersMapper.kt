package ai.inside.aia.demo.mapper

import ai.inside.aia.demo.entity.User
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UsersMapper {

    fun selectOne(@Param("id") id: Long): User
}
