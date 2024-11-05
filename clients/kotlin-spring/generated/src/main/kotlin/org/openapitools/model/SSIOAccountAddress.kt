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
 * @param display Address display
 * @param purpose Purpose for which the address is used, usually Billing or Businness
 * @param addressId Salesforce id for address
 * @param orderLegalEntity Legal entity for this insertion order
 */
data class SSIOAccountAddress(

    @Schema(example = "475 Brannan Street, San Francisco, CA 94103", description = "Address display")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "Billing", description = "Purpose for which the address is used, usually Billing or Businness")
    @get:JsonProperty("purpose") val purpose: kotlin.String? = null,

    @Schema(example = "a1C1N000004MUrLUAW", description = "Salesforce id for address")
    @get:JsonProperty("address_id") val addressId: kotlin.String? = null,

    @Schema(example = "PIN US OU", description = "Legal entity for this insertion order")
    @get:JsonProperty("order_legal_entity") val orderLegalEntity: kotlin.String? = null
    ) {

}

