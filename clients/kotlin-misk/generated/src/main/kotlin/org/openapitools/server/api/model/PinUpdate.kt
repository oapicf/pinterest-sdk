package org.openapitools.server.api.model

import org.openapitools.server.api.model.AiDisclosuresUpdate
import org.openapitools.server.api.model.CarouselSlot
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinUpdate(
    /** AI disclosure declarations the creator has made about this Pin. */
    val aiDisclosures: AiDisclosuresUpdate? = null,
    val altText: kotlin.String? = null,
    /** The board to which this Pin belongs. */
    val boardId: kotlin.String? = null,
    /** The board section to which this Pin belongs. */
    val boardSectionId: kotlin.String? = null,
    /** Carousel Pin slots data. */
    val carouselSlots: kotlin.collections.List<CarouselSlot>? = null,
    val description: kotlin.String? = null,
    val link: kotlin.String? = null,
    val title: kotlin.String? = null
)
