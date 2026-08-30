@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsDeleteRetailItem(
    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

    @field:JsonProperty("last_updated_time")
    val lastUpdatedTime: kotlin.Long? = null,

)
