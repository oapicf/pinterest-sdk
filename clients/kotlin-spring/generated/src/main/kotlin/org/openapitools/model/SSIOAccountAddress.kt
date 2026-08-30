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
 * Salesforce address information.
 * @param addressId Salesforce id for address
 * @param display Address display
 * @param orderLegalEntity Legal entity for this insertion order
 * @param purpose Purpose for which the address is used, usually Billing or Businness
 */
data class SSIOAccountAddress(

    @Schema(example = "a1C1N000004MUrLUAW", description = "Salesforce id for address")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("address_id")
    @get:JsonProperty("address_id") val addressId: kotlin.String? = null,

    @Schema(example = "475 Brannan Street, San Francisco, CA 94103", description = "Address display")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("display")
    @get:JsonProperty("display") val display: kotlin.String? = null,

    @Schema(example = "PIN US OU", description = "Legal entity for this insertion order")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("order_legal_entity")
    @get:JsonProperty("order_legal_entity") val orderLegalEntity: kotlin.String? = null,

    @Schema(example = "Billing", description = "Purpose for which the address is used, usually Billing or Businness")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("purpose")
    @get:JsonProperty("purpose") val purpose: kotlin.String? = null
) {

}

