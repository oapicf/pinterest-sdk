package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemProcessingStatus
import org.openapitools.server.api.model.ItemValidationEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemProcessingRecord(
    /** Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    val errors: kotlin.collections.List<ItemValidationEvent>? = null,
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String? = null,
    val status: ItemProcessingStatus? = null,
    /** Array with the validation warnings for the item processing record */
    val warnings: kotlin.collections.List<ItemValidationEvent>? = null
)
