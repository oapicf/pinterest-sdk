package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinsSaveRequestCreate(
    /** Unique identifier of the board to which the pin will be saved. */
    val boardId: kotlin.String? = null,
    /** Unique identifier of the board section to which the pin will be saved. */
    val boardSectionId: kotlin.String? = null
)
