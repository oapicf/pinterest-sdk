package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdAccountsCountry
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountCountriesGet200Response(
    val items: kotlin.collections.List<AdAccountsCountry>
)
