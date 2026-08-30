package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupCurrencyCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CurrencyFilter(
    val CURRENCY: CatalogsProductGroupCurrencyCriteria
)
