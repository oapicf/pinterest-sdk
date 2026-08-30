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
 * @param metrics Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
 * @param targetingType The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
 * @param targetingValue The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
 */
data class MetricsResponseDataItems(

    @field:Valid
    @Schema(required = true, description = "Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).")
    @param:JsonProperty("metrics")
    @get:JsonProperty("metrics", required = true) val metrics: kotlin.Any,

    @Schema(required = true, description = "The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)")
    @param:JsonProperty("targeting_type")
    @get:JsonProperty("targeting_type", required = true) val targetingType: kotlin.String,

    @Schema(required = true, description = "The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')")
    @param:JsonProperty("targeting_value")
    @get:JsonProperty("targeting_value", required = true) val targetingValue: kotlin.String
) {

}

