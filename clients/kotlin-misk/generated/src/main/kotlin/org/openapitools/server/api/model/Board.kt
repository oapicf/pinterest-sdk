package org.openapitools.server.api.model

import org.openapitools.server.api.model.BoardMedia
import org.openapitools.server.api.model.BoardOwner
import org.openapitools.server.api.model.BoardPrivacy
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Board(
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
    val pinCount: kotlin.Int? = null,
    /**     Privacy setting for a board. Learn more about [secret](https://help.pinterest.com/en/article/secret-boards)     boards and [protected](https://help.pinterest.com/en/business/article/protected-boards) boards.      **Note:** If you create an ad-only board by setting &#x60;is_ads_only&#x60;     to &#x60;true&#x60;, the &#x60;privacy&#x60; settng automatically becomes &#x60;PROTECTED&#x60;.  */
    val privacy: BoardPrivacy? = null
)
