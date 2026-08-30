package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingTemplateAudienceSizingReachEstimate(
    val estimate: kotlin.Long? = null,
    val lowerBound: kotlin.Long? = null,
    val upperBound: kotlin.Long? = null
)
