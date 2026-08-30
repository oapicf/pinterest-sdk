@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsItemErrorResponse(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<ItemValidationEvent>,

    @field:JsonProperty("item_response_kind")
    val itemResponseKind: kotlin.String,

    @field:JsonProperty("creative_assets_id")
    val creativeAssetsId: kotlin.String? = null,

)
