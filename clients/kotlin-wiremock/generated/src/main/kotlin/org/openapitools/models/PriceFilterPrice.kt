@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PriceFilterPrice(
    @field:JsonProperty("currency")
    val currency: NonNullableCatalogsCurrency,

    @field:JsonProperty("operator")
    val `operator`: NumericFilterOperatorType,

    @field:JsonProperty("value")
    val `value`: java.math.BigDecimal,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
