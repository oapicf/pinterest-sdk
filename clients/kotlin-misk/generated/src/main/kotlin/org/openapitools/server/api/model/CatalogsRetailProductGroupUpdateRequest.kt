package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailProductGroupUpdateRequest(
    /** Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    val catalogType: kotlin.String? = null,
    val country: Country? = null,
    val description: kotlin.String? = null,
    val filters: CatalogsProductGroupFiltersRequest? = null,
    val locale: CatalogsLocale? = null,
    /** Name of catalog product group */
    val name: kotlin.String? = null
)
