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
 * Demographic detail for a single audience demographic
 * @param key Unique key for demographic item
 * @param name Display name for demographic
 * @param ratio Value of demographic item as a percent of total audience
 */
data class AudienceDemographicValue(

    @Schema(example = "us", description = "Unique key for demographic item")
    @get:JsonProperty("key") val key: kotlin.String? = null,

    @Schema(example = "United States", description = "Display name for demographic")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "0.551", description = "Value of demographic item as a percent of total audience")
    @get:JsonProperty("ratio") val ratio: java.math.BigDecimal? = null
) {

}

