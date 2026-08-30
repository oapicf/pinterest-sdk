@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinBase(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("ai_disclosures")
    val aiDisclosures: AiDisclosures? = null,

    @field:JsonProperty("board_id")
    val boardId: kotlin.String? = null,

    @field:JsonProperty("board_owner")
    val boardOwner: BoardOwner? = null,

    @field:JsonProperty("board_section_id")
    val boardSectionId: kotlin.String? = null,

    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("creative_type")
    val creativeType: CreativeType? = null,

    @field:JsonProperty("dominant_color")
    val dominantColor: kotlin.String? = null,

    @field:JsonProperty("has_been_promoted")
    val hasBeenPromoted: kotlin.Boolean? = null,

    @field:JsonProperty("is_owner")
    val isOwner: kotlin.Boolean? = null,

    @field:JsonProperty("is_product")
    val isProduct: kotlin.Boolean? = null,

    @field:JsonProperty("is_standard")
    val isStandard: kotlin.Boolean? = null,

    @field:JsonProperty("media")
    val media: PinMedia? = null,

    @field:JsonProperty("parent_pin_id")
    val parentPinId: kotlin.String? = null,

    @field:JsonProperty("pin_metrics")
    val pinMetrics: kotlin.Any? = null,

)
