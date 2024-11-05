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
 * @param success Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
 * @param errorCode Error code type if error occurs
 * @param errorMessage Reason for failure
 */
data class AdsCreditRedeemResponse(

    @Schema(example = "false", description = "Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).")
    @get:JsonProperty("success") val success: kotlin.Boolean? = null,

    @Schema(example = "2708", description = "Error code type if error occurs")
    @get:JsonProperty("errorCode") val errorCode: kotlin.Int? = null,

    @Schema(example = "The offer has already been redeemed by this advertiser", description = "Reason for failure")
    @get:JsonProperty("errorMessage") val errorMessage: kotlin.String? = null
    ) {

}

