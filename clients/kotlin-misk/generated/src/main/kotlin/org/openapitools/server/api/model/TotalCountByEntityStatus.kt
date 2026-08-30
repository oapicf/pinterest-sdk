package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TotalCountByEntityStatus(
    /** Count of ACTIVE assets */
    val ACTIVE: kotlin.Int? = null,
    /** Count of ARCHIVED assets */
    val ARCHIVED: kotlin.Int? = null,
    /** Count of PAUSED assets */
    val PAUSED: kotlin.Int? = null
)
