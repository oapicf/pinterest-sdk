package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * The ID of the ad account.
 * @param adAccountId The ID of the ad account.
 * @param hasAccepted Whether the ad account has accepted terms of service.
 * @param html The terms of service content
 * @param id The ID of the terms of service
 */
data class TermsOfService(

    @Schema(example = "549755885175", description = "The ID of the ad account.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "true", description = "Whether the ad account has accepted terms of service.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("has_accepted")
    @get:JsonProperty("has_accepted") val hasAccepted: kotlin.Boolean? = null,

    @Schema(example = "example test", description = "The terms of service content")
    @param:JsonProperty("html")
    @get:JsonProperty("html") val html: kotlin.String? = null,

    @Schema(example = "2650449554526", description = "The ID of the terms of service")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null
) {

}

