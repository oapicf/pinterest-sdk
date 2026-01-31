package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Currency
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
 * @param amount Numeric value.
 * @param currencyCode 
 * @param customText Custom text.
 * @param percent Percent value.
 */
data class PromotionTemplateValue(

    @Schema(example = "100", description = "Numeric value.")
    @get:JsonProperty("amount") val amount: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency_code") val currencyCode: Currency? = null,

    @Schema(example = "My promotion", description = "Custom text.")
    @get:JsonProperty("custom_text") val customText: kotlin.String? = null,

    @Schema(example = "10", description = "Percent value.")
    @get:JsonProperty("percent") val percent: java.math.BigDecimal? = null
) {

}

