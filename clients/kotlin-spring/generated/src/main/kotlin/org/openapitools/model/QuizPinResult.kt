package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * The result, and link out, based on the user’s choice.
 * @param organicPinId 
 * @param androidDeepLink 
 * @param iosDeepLink 
 * @param destinationUrl 
 * @param resultId 
 */
data class QuizPinResult(

    @Schema(example = "null", description = "")
    @get:JsonProperty("organic_pin_id") val organicPinId: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("android_deep_link") val androidDeepLink: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("ios_deep_link") val iosDeepLink: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("destination_url") val destinationUrl: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("result_id") val resultId: java.math.BigDecimal? = null
    ) {

}

