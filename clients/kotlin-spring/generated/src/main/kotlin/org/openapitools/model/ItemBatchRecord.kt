package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemAttributes
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Object describing an item batch record
 * @param itemId The catalog item id in the merchant namespace
 * @param attributes 
 */
data class ItemBatchRecord(

    @field:JsonProperty("item_id") val itemId: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("attributes") val attributes: ItemAttributes? = null
) {

}

