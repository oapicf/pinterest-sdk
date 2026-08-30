@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateMemberAssetsResultsResponseArray(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<UpdateMemberAssetResultItem>? = null,

)
