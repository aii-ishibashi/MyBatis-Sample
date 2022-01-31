package ai.inside.aia.demo.mapper

import ai.inside.aia.demo.dto.UnitRegisterParam
import ai.inside.aia.demo.dto.UnitUpdateParam
import ai.inside.aia.demo.entity.Page
import ai.inside.aia.demo.entity.Unit
import ai.inside.aia.demo.entity.UnitWithPages
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Param
import org.springframework.stereotype.Repository

@Mapper
@Repository
interface UnitsMapper {

    fun selectById(@Param("id") id: Long): Unit

    fun insert(@Param("param") param: UnitRegisterParam)

    fun update(@Param("id") id: Long, @Param("param") param: UnitUpdateParam)

    fun deleteById(@Param("id") id: Long)

    fun selectByUnitIdAndPageId(@Param("unitId") unitId: Long, @Param("pageId") pageId: Long): Page

    fun selectByUnitIdWithPages(@Param("unitId") unitId: Long): UnitWithPages

    fun selectAllPages(): List<Page>
}
