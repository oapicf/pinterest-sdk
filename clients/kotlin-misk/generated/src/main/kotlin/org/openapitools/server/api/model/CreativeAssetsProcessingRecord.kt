package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemProcessingStatus
import org.openapitools.server.api.model.ItemValidationEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreativeAssetsProcessingRecord(
    /** The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String? = null,
    /** Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    val errors: kotlin.collections.List<ItemValidationEvent>? = null,
    val status: ItemProcessingStatus? = null,
    /** Array with the validation warnings for the item processing record */
    val warnings: kotlin.collections.List<ItemValidationEvent>? = null
)
