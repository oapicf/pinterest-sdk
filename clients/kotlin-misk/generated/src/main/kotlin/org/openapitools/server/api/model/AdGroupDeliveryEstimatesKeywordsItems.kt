package org.openapitools.server.api.model

import org.openapitools.server.api.model.NullalbleMatchType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupDeliveryEstimatesKeywordsItems(
    val matchType: NullalbleMatchType,
    /** Keyword value (120 chars max). */
    val `value`: kotlin.String
)
