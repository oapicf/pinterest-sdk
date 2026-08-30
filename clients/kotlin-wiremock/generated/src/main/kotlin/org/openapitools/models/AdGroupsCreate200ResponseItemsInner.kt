@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupsCreate200ResponseItemsInner(
    @field:JsonProperty("data")
    val `data`: AdGroup? = null,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<PinterestLibBatchItemException>? = null,

)
