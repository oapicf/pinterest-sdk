@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsUpdateRetailItem(
    @field:JsonProperty("attributes")
    val attributes: UpdatableItemAttributes,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

    @field:JsonProperty("update_mask")
    val updateMask: kotlin.collections.List<UpdateMaskFieldType>? = null,

)
