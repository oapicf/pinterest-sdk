package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreateRetailItem
import org.openapitools.server.api.model.CatalogsDeleteRetailItem
import org.openapitools.server.api.model.CatalogsUpdateRetailItem
import org.openapitools.server.api.model.CatalogsUpsertRetailItem
import org.openapitools.server.api.model.ItemAttributesRequest
import org.openapitools.server.api.model.UpdateMaskFieldType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailBatchRequestItemsItems(
    val attributes: ItemAttributesRequest,
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    val operation: kotlin.String,
    /** The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    val updateMask: kotlin.collections.List<UpdateMaskFieldType>? = null,
    /** The millisecond timestamp when the item was lastly modified by the merchant. */
    val lastUpdatedTime: kotlin.Long? = null
)
