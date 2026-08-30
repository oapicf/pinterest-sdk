package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionTagType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventResponse(
    /** Id of the ad account. */
    val adAccountId: kotlin.String? = null,
    val conversionEvent: ConversionTagType? = null,
    /** Id of the tag. */
    val conversionTagId: kotlin.String? = null,
    /** Creation date in epoch format. */
    val createdTime: kotlin.Int? = null,
    /** For advertiser-defined events, the reporting event label shown in optimization UIs. */
    val reportingConversionEvent: kotlin.String? = null
)
