package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemAttributesRequest
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Object describing an item batch record to create items
 * @param itemId The catalog item id in the merchant namespace
 * @param attributes 
 */
data class ItemCreateBatchRecord(

    @Schema(example = "DS0294-M", description = "The catalog item id in the merchant namespace")
    @get:JsonProperty("item_id") val itemId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("attributes") val attributes: ItemAttributesRequest? = null
    ) {

}

