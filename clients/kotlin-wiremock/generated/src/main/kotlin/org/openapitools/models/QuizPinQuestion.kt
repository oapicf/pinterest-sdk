@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QuizPinQuestion(
    @field:JsonProperty("options")
    val options: kotlin.collections.List<QuizPinOption>? = null,

    @field:JsonProperty("question_id")
    val questionId: java.math.BigDecimal? = null,

    @field:JsonProperty("question_text")
    val questionText: kotlin.String? = null,

)
