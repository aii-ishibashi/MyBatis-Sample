package ai.inside.aia.demo.service

import ai.inside.aia.demo.dto.UnitRegisterParam
import ai.inside.aia.demo.dto.UnitUpdateParam
import ai.inside.aia.demo.entity.Page
import ai.inside.aia.demo.entity.Unit
import ai.inside.aia.demo.entity.UnitWithPages
import ai.inside.aia.demo.mapper.UnitsMapper
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UnitService(private val unitRepository: UnitsMapper) {

    fun selectOne(unitId: Long): Unit {
        return this.unitRepository.selectById(unitId)
    }

    fun selectPage(unitId: Long, pageId: Long): Page {
        return this.unitRepository.selectByUnitIdAndPageId(unitId, pageId)
    }

    fun selectWithPages(unitId: Long): UnitWithPages {
        return this.unitRepository.selectByUnitIdWithPages(unitId)
    }

    fun selectAllPages(): List<Page> {
        return this.unitRepository.selectAllPages()
    }

    @Transactional
    fun register(registerParam: UnitRegisterParam) {
        this.unitRepository.insert(registerParam)
    }

    @Transactional
    fun update(unitId: Long, updateParam: UnitUpdateParam){
        this.unitRepository.update(unitId, updateParam)
    }

    @Transactional
    fun delete(unitId: Long) {
        this.unitRepository.deleteById(unitId)
    }
}
