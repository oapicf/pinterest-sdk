package org.openapitools.server.api.model

import org.openapitools.server.api.model.AiDisclosures
import org.openapitools.server.api.model.BoardOwner
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.PinMedia
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Pin(
    val id: kotlin.String,
    /** AI disclosure declarations the creator has made about this Pin. */
    val aiDisclosures: AiDisclosures? = null,
    /** The board to which this Pin belongs. */
    val boardId: kotlin.String? = null,
    val boardOwner: BoardOwner? = null,
    /** The board section to which this Pin belongs. */
    val boardSectionId: kotlin.String? = null,
    val createdAt: java.time.OffsetDateTime? = null,
    val creativeType: CreativeType? = null,
    /** Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. */
    val dominantColor: kotlin.String? = null,
    /** Whether the Pin has been promoted or not. */
    val hasBeenPromoted: kotlin.Boolean? = null,
    /** Whether the \&quot;operation user_account\&quot; is the Pin owner. */
    val isOwner: kotlin.Boolean? = null,
    /** Whether the Pin is a product Pin. */
    val isProduct: kotlin.Boolean? = null,
    /** Whether the Pin is standard or not. See documentation on [Changes to Pin creation](/docs/api-features/content-overview/) for more information. */
    val isStandard: kotlin.Boolean? = null,
    val media: PinMedia? = null,
    /** The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
    val parentPinId: kotlin.String? = null,
    /** Pin metrics with associated time intervals if any. */
    val pinMetrics: kotlin.Any? = null,
    val altText: kotlin.String? = null,
    val description: kotlin.String? = null,
    val link: kotlin.String? = null,
    val title: kotlin.String? = null
)
