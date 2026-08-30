package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupTrackingURLs(
    val audienceVerification: kotlin.collections.List<kotlin.String>? = null,
    val buyableButton: kotlin.collections.List<kotlin.String>? = null,
    val click: kotlin.collections.List<kotlin.String>? = null,
    val engagement: kotlin.collections.List<kotlin.String>? = null,
    val impression: kotlin.collections.List<kotlin.String>? = null
)
