package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemProcessingStatus
import org.openapitools.model.ItemValidationEvent
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Object describing an item processing record
 * @param itemId The catalog item id in the merchant namespace
 * @param errors Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
 * @param warnings Array with the validation warnings for the item processing record
 * @param status 
 */
data class ItemProcessingRecord(

    @field:JsonProperty("item_id") val itemId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("errors") val errors: kotlin.collections.List<ItemValidationEvent>? = null,

    @field:Valid
    @field:JsonProperty("warnings") val warnings: kotlin.collections.List<ItemValidationEvent>? = null,

    @field:Valid
    @field:JsonProperty("status") val status: ItemProcessingStatus? = null
) {

}

