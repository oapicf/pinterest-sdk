@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QuizPinData(
    @field:JsonProperty("questions")
    val questions: kotlin.collections.List<QuizPinQuestion>? = null,

    @field:JsonProperty("results")
    val results: kotlin.collections.List<QuizPinResult>? = null,

    @field:JsonProperty("tie_breaker_custom_result")
    val tieBreakerCustomResult: QuizPinResult? = null,

    @field:JsonProperty("tie_breaker_type")
    val tieBreakerType: TieBreakerType? = null,

)
