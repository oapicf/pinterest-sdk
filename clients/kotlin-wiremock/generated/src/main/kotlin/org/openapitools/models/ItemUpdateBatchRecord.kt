@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemUpdateBatchRecord(
    @field:JsonProperty("attributes")
    val attributes: UpdatableItemAttributes? = null,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String? = null,

    @field:JsonProperty("update_mask")
    val updateMask: kotlin.collections.List<UpdateMaskFieldType>? = null,

)
