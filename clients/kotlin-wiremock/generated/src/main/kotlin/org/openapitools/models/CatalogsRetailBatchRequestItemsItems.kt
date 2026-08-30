@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailBatchRequestItemsItems(
    @field:JsonProperty("attributes")
    val attributes: ItemAttributesRequest,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

    @field:JsonProperty("update_mask")
    val updateMask: kotlin.collections.List<UpdateMaskFieldType>? = null,

    @field:JsonProperty("last_updated_time")
    val lastUpdatedTime: kotlin.Long? = null,

)
