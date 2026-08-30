@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeletePartnerAssetAccessResultsResponseArray(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<DeletePartnerAssetAccessResult>? = null,

)
