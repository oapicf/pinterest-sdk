package org.openapitools.server.api.model

import org.openapitools.server.api.model.NonNullableCatalogsCurrency
import org.openapitools.server.api.model.NumericFilterOperatorType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PriceFilterPrice(
    val currency: NonNullableCatalogsCurrency,
    val `operator`: NumericFilterOperatorType,
    val `value`: java.math.BigDecimal,
    val negated: kotlin.Boolean? = null
)
