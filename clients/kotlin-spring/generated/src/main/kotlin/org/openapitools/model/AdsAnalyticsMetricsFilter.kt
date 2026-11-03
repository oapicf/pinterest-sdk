package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdsAnalyticsFilterColumn
import org.openapitools.model.AdsAnalyticsFilterOperator
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
 * @param `field` 
 * @param `operator` 
 * @param propertyValues List of values for filtering
 */
data class AdsAnalyticsMetricsFilter(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("field", required = true)
    @get:JsonProperty("field", required = true) val `field`: AdsAnalyticsFilterColumn,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operator", required = true)
    @get:JsonProperty("operator", required = true) val `operator`: AdsAnalyticsFilterOperator,

    @field:Valid
    @get:Size(min=1)
    @Schema(required = true, description = "List of values for filtering")
    @param:JsonProperty("values", required = true)
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<java.math.BigDecimal>
) {

}

