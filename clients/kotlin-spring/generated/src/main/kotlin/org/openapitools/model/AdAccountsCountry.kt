package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Country
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
 * @param code 
 * @param currency Country currency.
 * @param index Country index
 * @param name Country name
 */
data class AdAccountsCountry(

    @field:Valid
    @Schema(example = "US", required = true, description = "")
    @param:JsonProperty("code")
    @get:JsonProperty("code", required = true) val code: Country,

    @Schema(example = "Dollars", required = true, description = "Country currency.")
    @param:JsonProperty("currency")
    @get:JsonProperty("currency", required = true) val currency: kotlin.String,

    @Schema(example = "1", required = true, description = "Country index")
    @param:JsonProperty("index")
    @get:JsonProperty("index", required = true) val index: java.math.BigDecimal,

    @Schema(example = "United States of America", required = true, description = "Country name")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String
) {

}

