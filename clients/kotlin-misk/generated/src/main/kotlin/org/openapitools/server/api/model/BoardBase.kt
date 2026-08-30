package org.openapitools.server.api.model

import org.openapitools.server.api.model.BoardMedia
import org.openapitools.server.api.model.BoardOwner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardBase(
    val id: kotlin.String,
    /**     Name of the board.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the board name automatically becomes \&quot;Ad-only Pins\&quot;. */
    val name: kotlin.String,
    /** Date and time of last board pins modified. */
    val boardPinsModifiedAt: java.time.OffsetDateTime? = null,
    /** Count of collaborators on the board. */
    val collaboratorCount: kotlin.Int? = null,
    /** Date and time of board creation. */
    val createdAt: java.time.OffsetDateTime? = null,
    val description: kotlin.String? = null,
    /** Board follower count. */
    val followerCount: kotlin.Int? = null,
    /** If set to &#x60;true&#x60;, the board will be ad-only and can store ad-only Pins. */
    val isAdsOnly: kotlin.Boolean? = false,
    /** Board media. */
    val media: BoardMedia? = null,
    val owner: BoardOwner? = null,
    /** Count of Pins on the board. */
    val pinCount: kotlin.Int? = null
)
