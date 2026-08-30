package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest
import org.openapitools.server.api.model.Country
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailProductGroupCreateRequest(
    /** Catalog ID pertaining to the product group. */
    val catalogId: kotlin.String,
    /** Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
    val catalogType: kotlin.String,
    val filters: CatalogsProductGroupFiltersRequest,
    val name: kotlin.String,
    val country: Country? = null,
    val description: kotlin.String? = null,
    val locale: CatalogsLocale? = null
)
