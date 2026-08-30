package org.openapitools.server.api.model

import org.openapitools.server.api.model.QuizPinQuestion
import org.openapitools.server.api.model.QuizPinResult
import org.openapitools.server.api.model.TieBreakerType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class QuizPinData(
    val questions: kotlin.collections.List<QuizPinQuestion>? = null,
    val results: kotlin.collections.List<QuizPinResult>? = null,
    val tieBreakerCustomResult: QuizPinResult? = null,
    val tieBreakerType: TieBreakerType? = null
)
