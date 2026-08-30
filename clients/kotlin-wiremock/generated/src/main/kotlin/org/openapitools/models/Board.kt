@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Board(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("board_pins_modified_at")
    val boardPinsModifiedAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("collaborator_count")
    val collaboratorCount: kotlin.Int? = null,

    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("follower_count")
    val followerCount: kotlin.Int? = null,

    @field:JsonProperty("is_ads_only")
    val isAdsOnly: kotlin.Boolean? = false,

    @field:JsonProperty("media")
    val media: BoardMedia? = null,

    @field:JsonProperty("owner")
    val owner: BoardOwner? = null,

    @field:JsonProperty("pin_count")
    val pinCount: kotlin.Int? = null,

    @field:JsonProperty("privacy")
    val privacy: BoardPrivacy? = null,

)
