package org.openapitools.server.api.model

import org.openapitools.server.api.model.UpdatableItemAttributes
import org.openapitools.server.api.model.UpdateMaskFieldType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemUpdateBatchRecord(
    val attributes: UpdatableItemAttributes? = null,
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String? = null,
    /** The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    val updateMask: kotlin.collections.List<UpdateMaskFieldType>? = null
)
