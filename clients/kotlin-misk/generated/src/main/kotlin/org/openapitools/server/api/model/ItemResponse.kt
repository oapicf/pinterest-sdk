package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsAttributes
import org.openapitools.server.api.model.CatalogsCreativeAssetsItemErrorResponse
import org.openapitools.server.api.model.CatalogsCreativeAssetsItemResponse
import org.openapitools.server.api.model.CatalogsHotelItemErrorResponse
import org.openapitools.server.api.model.CatalogsHotelItemResponse
import org.openapitools.server.api.model.CatalogsRetailItemErrorResponse
import org.openapitools.server.api.model.CatalogsRetailItemResponse
import org.openapitools.server.api.model.ItemValidationEvent
import org.openapitools.server.api.model.Pin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemResponse(
    val catalogType: kotlin.String,
    /** Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. */
    val itemResponseKind: kotlin.String,
    /** Array with the errors for the item id requested */
    val errors: kotlin.collections.List<ItemValidationEvent>,
    val attributes: CatalogsCreativeAssetsAttributes? = null,
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String? = null,
    /** The pins mapped to the item */
    val pins: kotlin.collections.List<Pin>? = null,
    /** The catalog hotel id in the merchant namespace */
    val hotelId: kotlin.String? = null,
    /** The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String? = null
)
