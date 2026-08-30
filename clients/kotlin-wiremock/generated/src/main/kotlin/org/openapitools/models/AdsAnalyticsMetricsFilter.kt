@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdsAnalyticsMetricsFilter(
    @field:JsonProperty("field")
    val `field`: AdsAnalyticsFilterColumn,

    @field:JsonProperty("operator")
    val `operator`: AdsAnalyticsFilterOperator,

    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<java.math.BigDecimal>,

)
