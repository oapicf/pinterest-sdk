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
 * @param offerCodeHash Takes in a SHA256 hash of the offerCode.
 * @param validateOnly If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
 */
data class AdsCreditRedeemRequest(

    @get:Pattern(regexp="^[a-z0-9]*$")
    @Schema(example = "138e9e0ff7e38cf511b880975eb574c09aa9d5e1657590ab0431040da68caa67", required = true, description = "Takes in a SHA256 hash of the offerCode.")
    @get:JsonProperty("offerCodeHash", required = true) val offerCodeHash: kotlin.String,

    @Schema(example = "true", required = true, description = "If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account")
    @get:JsonProperty("validateOnly", required = true) val validateOnly: kotlin.Boolean
) {

}

