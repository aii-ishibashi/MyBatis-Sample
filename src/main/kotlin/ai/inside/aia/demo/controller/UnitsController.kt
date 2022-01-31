package ai.inside.aia.demo.controller

import ai.inside.aia.demo.entity.Unit
import ai.inside.aia.demo.dto.UnitRegisterParam
import ai.inside.aia.demo.dto.UnitUpdateParam
import ai.inside.aia.demo.entity.Page
import ai.inside.aia.demo.entity.UnitWithPages
import ai.inside.aia.demo.service.UnitService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class UnitController(private val unitService: UnitService) {
    @GetMapping("/units/{id}")
    fun selectOne(@PathVariable id: Long): Unit {
        return this.unitService.selectOne(id)
    }

    @PostMapping("/units")
    fun registerUnit(@RequestBody registerParam: UnitRegisterParam) {
        return this.unitService.register(registerParam)
    }

    @PutMapping("/units/{unitId}")
    fun updateUnit(@PathVariable unitId: Long, @RequestBody updateParam: UnitUpdateParam) {
        return this.unitService.update(unitId, updateParam)
    }

    @DeleteMapping("/units/{unitId}")
    fun deleteUnit(@PathVariable unitId: Long) {
        this.unitService.delete(unitId)
    }

    @GetMapping("/units/{unitId}/pages/{pageId}")
    fun selectPage(@PathVariable unitId: Long, @PathVariable pageId: Long): Page {
        return this.unitService.selectPage(unitId, pageId)
    }

    @GetMapping("/units/{id}/pages")
    fun selectWithPages(@PathVariable id: Long): UnitWithPages {
        return this.unitService.selectWithPages(id)
    }

    @GetMapping("/pages")
    fun selectAllPages(): List<Page> {
        return this.unitService.selectAllPages()
    }
}
