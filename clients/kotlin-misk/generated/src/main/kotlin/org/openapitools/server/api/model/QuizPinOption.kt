package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuizPinOption(
    val id: java.math.BigDecimal? = null,
    val text: kotlin.String? = null
)
