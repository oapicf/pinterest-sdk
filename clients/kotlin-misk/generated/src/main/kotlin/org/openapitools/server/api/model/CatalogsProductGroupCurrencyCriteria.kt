package org.openapitools.server.api.model

import org.openapitools.server.api.model.NonNullableCatalogsCurrency
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupCurrencyCriteria(
    val propertyValues: NonNullableCatalogsCurrency,
    val negated: kotlin.Boolean? = null
)
