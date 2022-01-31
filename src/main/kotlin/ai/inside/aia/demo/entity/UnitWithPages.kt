package ai.inside.aia.demo.entity

import ai.inside.aia.demo.NoArg

@NoArg
data class UnitWithPages (
    val id: Long,
    val name: String,
    val pages: List<Page>
)
