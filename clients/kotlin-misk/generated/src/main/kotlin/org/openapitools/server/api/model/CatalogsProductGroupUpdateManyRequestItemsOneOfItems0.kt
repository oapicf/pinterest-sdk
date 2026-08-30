package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupFiltersRequest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupUpdateManyRequestItemsOneOfItems0(
    /** ID of the product group. */
    val id: kotlin.String,
    val description: kotlin.String? = null,
    val filters: CatalogsProductGroupFiltersRequest? = null,
    /** boolean indicator of whether the product group is being featured or not */
    val isFeatured: kotlin.Boolean? = null,
    val name: kotlin.String? = null
)
