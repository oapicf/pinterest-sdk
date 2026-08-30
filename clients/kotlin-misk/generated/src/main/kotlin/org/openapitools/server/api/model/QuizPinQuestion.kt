package org.openapitools.server.api.model

import org.openapitools.server.api.model.QuizPinOption
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuizPinQuestion(
    val options: kotlin.collections.List<QuizPinOption>? = null,
    val questionId: java.math.BigDecimal? = null,
    val questionText: kotlin.String? = null
)
