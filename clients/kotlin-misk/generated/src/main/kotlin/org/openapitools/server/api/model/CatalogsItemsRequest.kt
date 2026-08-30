package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsItemsPostFilters
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsItemsRequest(
    val country: Country,
    val filters: CatalogsItemsPostFilters,
    /** We recommend using the CatalogsLocale values. */
    val language: kotlin.String
)
