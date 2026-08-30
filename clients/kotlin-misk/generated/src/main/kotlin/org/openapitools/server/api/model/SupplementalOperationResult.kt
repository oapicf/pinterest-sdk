package org.openapitools.server.api.model

import org.openapitools.server.api.model.SupplementalItemProcessingStatus
import org.openapitools.server.api.model.SupplementalItemValidationEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SupplementalOperationResult(
    /** Catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    /** Status of the item processing record */
    val status: SupplementalItemProcessingStatus,
    /** Store code for the local inventory item */
    val storeCode: kotlin.String,
    val supplementalType: kotlin.String,
    /** Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
    val errors: kotlin.collections.List<SupplementalItemValidationEvent>? = null,
    /** Array with the validation warnings for the item processing record */
    val warnings: kotlin.collections.List<SupplementalItemValidationEvent>? = null
)
