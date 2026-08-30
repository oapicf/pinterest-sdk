@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QuizPinResult(
    @field:JsonProperty("android_deep_link")
    val androidDeepLink: kotlin.String? = null,

    @field:JsonProperty("destination_url")
    val destinationUrl: kotlin.String? = null,

    @field:JsonProperty("ios_deep_link")
    val iosDeepLink: kotlin.String? = null,

    @field:JsonProperty("organic_pin_id")
    val organicPinId: kotlin.String? = null,

    @field:JsonProperty("result_id")
    val resultId: java.math.BigDecimal? = null,

)
