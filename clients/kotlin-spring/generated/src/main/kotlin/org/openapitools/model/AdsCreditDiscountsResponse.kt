package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdsCreditDiscountType
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
 * @param active True if the offer code is currently active.
 * @param advertiserId Advertiser ID the offer was applied to.
 * @param discountCurrency Currency value for the discount.
 * @param discountInMicroCurrency The discount applied in the offer's currency value.
 * @param discountType The type of discount of this credit
 * @param remainingDiscountInMicroCurrency The credits left to spend.
 * @param title Human readable title of the offer code.
 */
data class AdsCreditDiscountsResponse(

    @Schema(example = "true", description = "True if the offer code is currently active.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("active")
    @get:JsonProperty("active") val active: kotlin.Boolean? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "12312451231", description = "Advertiser ID the offer was applied to.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("advertiser_id")
    @get:JsonProperty("advertiser_id") val advertiserId: kotlin.String? = null,

    @Schema(example = "USD", description = "Currency value for the discount.")
    @param:JsonProperty("discountCurrency")
    @get:JsonProperty("discountCurrency") val discountCurrency: kotlin.String? = null,

    @Schema(example = "125000000", description = "The discount applied in the offer's currency value.")
    @param:JsonProperty("discountInMicroCurrency")
    @get:JsonProperty("discountInMicroCurrency") val discountInMicroCurrency: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "The type of discount of this credit")
    @param:JsonProperty("discountType")
    @get:JsonProperty("discountType") val discountType: AdsCreditDiscountType? = null,

    @Schema(example = "125000000", description = "The credits left to spend.")
    @param:JsonProperty("remainingDiscountInMicroCurrency")
    @get:JsonProperty("remainingDiscountInMicroCurrency") val remainingDiscountInMicroCurrency: java.math.BigDecimal? = null,

    @Schema(example = "Ads Credits", description = "Human readable title of the offer code.")
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null
) {

}

