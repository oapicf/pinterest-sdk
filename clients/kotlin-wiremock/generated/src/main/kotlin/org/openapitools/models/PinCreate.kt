@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinCreate(
    @field:JsonProperty("ai_disclosures")
    val aiDisclosures: AiDisclosures? = null,

    @field:JsonProperty("alt_text")
    val altText: kotlin.String? = null,

    @field:JsonProperty("board_id")
    val boardId: kotlin.String? = null,

    @field:JsonProperty("board_section_id")
    val boardSectionId: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("dominant_color")
    val dominantColor: kotlin.String? = null,

    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("media_source")
    val mediaSource: PinMediaSource? = null,

    @field:JsonProperty("parent_pin_id")
    val parentPinId: kotlin.String? = null,

    @field:JsonProperty("sponsor_id")
    val sponsorId: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

)
