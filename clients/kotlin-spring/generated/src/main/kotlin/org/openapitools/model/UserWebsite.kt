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
 * 
 * @param status Status of the verification process
 * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
 * @param website Website with path or domain only
 */
data class UserWebsite(

    @Schema(readOnly = true, description = "Status of the verification process")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @Schema(readOnly = true, description = "UTC timestamp when the verification happened - sometimes missing")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("verified_at")
    @get:JsonProperty("verified_at") val verifiedAt: kotlin.String? = null,

    @Schema(description = "Website with path or domain only")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("website")
    @get:JsonProperty("website") val website: kotlin.String? = null
) {

}

