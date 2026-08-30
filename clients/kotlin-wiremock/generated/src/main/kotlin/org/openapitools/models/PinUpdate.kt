@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinUpdate(
    @field:JsonProperty("ai_disclosures")
    val aiDisclosures: AiDisclosuresUpdate? = null,

    @field:JsonProperty("alt_text")
    val altText: kotlin.String? = null,

    @field:JsonProperty("board_id")
    val boardId: kotlin.String? = null,

    @field:JsonProperty("board_section_id")
    val boardSectionId: kotlin.String? = null,

    @field:JsonProperty("carousel_slots")
    val carouselSlots: kotlin.collections.List<CarouselSlot>? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

)
