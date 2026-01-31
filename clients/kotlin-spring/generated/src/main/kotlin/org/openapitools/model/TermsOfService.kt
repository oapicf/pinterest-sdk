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
 * 
 * @param id The ID of the terms of service
 * @param html The terms of service content
 * @param hasAccepted Whether the ad account has accepted terms of service.
 * @param adAccountId The ID of the ad account.
 */
data class TermsOfService(

    @Schema(example = "2650449554526", description = "The ID of the terms of service")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "example test", description = "The terms of service content")
    @get:JsonProperty("html") val html: kotlin.String? = null,

    @Schema(example = "true", description = "Whether the ad account has accepted terms of service.")
    @get:JsonProperty("has_accepted") val hasAccepted: kotlin.Boolean? = null,

    @Schema(example = "549755885175", description = "The ID of the ad account.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null
) {

}

