package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdCountry
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
data class AdAccountsCountryResponseData(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("code") val code: AdCountry? = null,

    @Schema(example = "Dollars", description = "Country currency.")
    @get:JsonProperty("currency") val currency: kotlin.String? = null,

    @Schema(example = "1", description = "Country index")
    @get:JsonProperty("index") val index: java.math.BigDecimal? = null,

    @Schema(example = "United States of America", description = "Country name")
    @get:JsonProperty("name") val name: kotlin.String? = null
    ) {

}

