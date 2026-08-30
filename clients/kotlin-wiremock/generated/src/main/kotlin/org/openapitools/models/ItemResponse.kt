@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemResponse(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("item_response_kind")
    val itemResponseKind: kotlin.String,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<ItemValidationEvent>,

    @field:JsonProperty("attributes")
    val attributes: CatalogsCreativeAssetsAttributes? = null,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String? = null,

    @field:JsonProperty("pins")
    val pins: kotlin.collections.List<Pin>? = null,

    @field:JsonProperty("hotel_id")
    val hotelId: kotlin.String? = null,

    @field:JsonProperty("creative_assets_id")
    val creativeAssetsId: kotlin.String? = null,

)
