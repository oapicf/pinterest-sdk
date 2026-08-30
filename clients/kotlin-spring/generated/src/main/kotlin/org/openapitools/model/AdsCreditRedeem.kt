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
 * Ads credit redemption
 * @param errorCode Error code type if error occurs
 * @param errorMessage Reason for failure
 * @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
 */
data class AdsCreditRedeem(

    @Schema(example = "2708", readOnly = true, description = "Error code type if error occurs")
    @param:JsonProperty("errorCode")
    @get:JsonProperty("errorCode") val errorCode: kotlin.Int? = null,

    @Schema(example = "The offer has already been redeemed by this advertiser", readOnly = true, description = "Reason for failure")
    @param:JsonProperty("errorMessage")
    @get:JsonProperty("errorMessage") val errorMessage: kotlin.String? = null,

    @Schema(example = "false", readOnly = true, description = "Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("success")
    @get:JsonProperty("success") val success: kotlin.Boolean? = null
) {

}

