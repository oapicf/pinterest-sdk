package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdsAnalyticsFilterColumn
import org.openapitools.model.AdsAnalyticsFilterOperator
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param &#x60;field&#x60; 
 * @param &#x60;operator&#x60; 
 * @param propertyValues List of values for filtering
 */
data class AdsAnalyticsMetricsFilter(

    @field:Valid
    @field:JsonProperty("field") val `field`: AdsAnalyticsFilterColumn? = null,

    @field:Valid
    @field:JsonProperty("operator") val `operator`: AdsAnalyticsFilterOperator? = null,

    @field:Valid
    @get:Size(min=1)
    @field:JsonProperty("values") val propertyValues: kotlin.collections.List<java.math.BigDecimal>? = null
) {

}

