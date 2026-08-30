@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocalInventoryOperationResult(
    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("status")
    val status: SupplementalItemProcessingStatus,

    @field:JsonProperty("store_code")
    val storeCode: kotlin.String,

    @field:JsonProperty("supplemental_type")
    val supplementalType: kotlin.String,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<SupplementalItemValidationEvent>? = null,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<SupplementalItemValidationEvent>? = null,

)
