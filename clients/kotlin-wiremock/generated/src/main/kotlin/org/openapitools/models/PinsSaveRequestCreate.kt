@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinsSaveRequestCreate(
    @field:JsonProperty("board_id")
    val boardId: kotlin.String? = null,

    @field:JsonProperty("board_section_id")
    val boardSectionId: kotlin.String? = null,

)
