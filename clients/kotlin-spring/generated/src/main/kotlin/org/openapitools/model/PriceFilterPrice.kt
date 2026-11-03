package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NonNullableCatalogsCurrency
import org.openapitools.model.NumericFilterOperatorType
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
 * @param currency 
 * @param `operator` 
 * @param `value` 
 * @param negated 
 */
data class PriceFilterPrice(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("currency", required = true)
    @get:JsonProperty("currency", required = true) val currency: NonNullableCatalogsCurrency,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operator", required = true)
    @get:JsonProperty("operator", required = true) val `operator`: NumericFilterOperatorType,

    @get:DecimalMin(value="0")
    @Schema(required = true, description = "")
    @param:JsonProperty("value", required = true)
    @get:JsonProperty("value", required = true) val `value`: java.math.BigDecimal,

    @Schema(description = "")
    @param:JsonProperty("negated")
    @get:JsonProperty("negated") val negated: kotlin.Boolean? = null
) {

}

