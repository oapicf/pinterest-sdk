@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsDeleteCreativeAssetsItem(
    @field:JsonProperty("creative_assets_id")
    val creativeAssetsId: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

)
