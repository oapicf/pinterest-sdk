@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsProductMetadata(
    @field:JsonProperty("creative_assets_id")
    val creativeAssetsId: kotlin.String,

    @field:JsonProperty("visibility")
    val visibility: CreativeAssetsVisibilityType,

)
