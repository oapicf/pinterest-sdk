package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NonNullableCatalogsCurrency
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
 * @param &#x60;operator&#x60; 
 * @param &#x60;value&#x60; 
 * @param currency 
 * @param negated 
 */
data class CatalogsProductGroupPricingCurrencyCriteria(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operator", required = true) val `operator`: CatalogsProductGroupPricingCurrencyCriteria.`Operator`,

    @get:DecimalMin("0")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("value", required = true) val `value`: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("currency", required = true) val currency: NonNullableCatalogsCurrency,

    @Schema(example = "null", description = "")
    @get:JsonProperty("negated") val negated: kotlin.Boolean? = false
    ) {

    /**
    * 
    * Values: GREATER_THAN,GREATER_THAN_OR_EQUALS,LESS_THAN,LESS_THAN_OR_EQUALS
    */
    enum class `Operator`(@get:JsonValue val value: kotlin.String) {

        GREATER_THAN("GREATER_THAN"),
        GREATER_THAN_OR_EQUALS("GREATER_THAN_OR_EQUALS"),
        LESS_THAN("LESS_THAN"),
        LESS_THAN_OR_EQUALS("LESS_THAN_OR_EQUALS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Operator` {
                return values().first{it -> it.value == value}
            }
        }
    }

}

