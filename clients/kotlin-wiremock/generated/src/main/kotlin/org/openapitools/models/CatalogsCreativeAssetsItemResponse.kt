@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsItemResponse(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("item_response_kind")
    val itemResponseKind: kotlin.String,

    @field:JsonProperty("attributes")
    val attributes: CatalogsCreativeAssetsAttributes? = null,

    @field:JsonProperty("creative_assets_id")
    val creativeAssetsId: kotlin.String? = null,

    @field:JsonProperty("pins")
    val pins: kotlin.collections.List<Pin>? = null,

)
