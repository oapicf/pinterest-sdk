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
 * @param PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to.
 * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
 */
data class ProductGroupAnalyticsItems(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "The ID of the product group that this metrics belongs to.")
    @param:JsonProperty("PRODUCT_GROUP_ID", required = true)
    @get:JsonProperty("PRODUCT_GROUP_ID", required = true) val PRODUCT_GROUP_ID: kotlin.String,

    @field:Valid
    @Schema(description = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
    @param:JsonProperty("DATE")
    @get:JsonProperty("DATE") val DATE: java.time.LocalDate? = null
) {

}

