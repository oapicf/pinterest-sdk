package org.openapitools.server.api.model

import org.openapitools.server.api.model.AiDisclosures
import org.openapitools.server.api.model.PinMediaSource
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinCreate(
    /** AI disclosure declarations the creator has made about this Pin. */
    val aiDisclosures: AiDisclosures? = null,
    val altText: kotlin.String? = null,
    /** The board to which this Pin belongs. */
    val boardId: kotlin.String? = null,
    /** The board section to which this Pin belongs. */
    val boardSectionId: kotlin.String? = null,
    val description: kotlin.String? = null,
    /** Dominant pin color. Hex number, e.g. &#x60;#6E7874&#x60;. */
    val dominantColor: kotlin.String? = null,
    val link: kotlin.String? = null,
    val mediaSource: PinMediaSource? = null,
    /** The source pin id if this pin was saved from another pin. [Learn more](https://help.pinterest.com/article/save-pins-on-pinterest). */
    val parentPinId: kotlin.String? = null,
    /** The sponsor account id to request paid partnership from.  Currently the field is only available to a list of users in a closed beta. */
    val sponsorId: kotlin.String? = null,
    val title: kotlin.String? = null
)
