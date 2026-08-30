package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleCountriesCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CountryFilter(
    val COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
)
