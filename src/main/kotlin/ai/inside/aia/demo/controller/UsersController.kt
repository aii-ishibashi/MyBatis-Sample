package ai.inside.aia.demo.controller

import ai.inside.aia.demo.entity.User
import ai.inside.aia.demo.mapper.UsersMapper
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class UsersController(val usersMapper: UsersMapper) {

    @GetMapping("/users/{id}")
    fun selectOne(@PathVariable id: Long): User {
        return this.usersMapper.selectOne(id)
    }
}
