package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuizPinResult(
    val androidDeepLink: kotlin.String? = null,
    val destinationUrl: kotlin.String? = null,
    val iosDeepLink: kotlin.String? = null,
    val organicPinId: kotlin.String? = null,
    val resultId: java.math.BigDecimal? = null
)
