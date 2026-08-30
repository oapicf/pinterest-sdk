package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemIdStoreCodePair
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
 * Resource create operation model.
 * @param itemFilters Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.
 */
data class LocalInventoryItemsGetCreate(

    @field:Valid
    @get:Size(min=1,max=1000) 
    @Schema(required = true, description = "Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items.")
    @param:JsonProperty("item_filters")
    @get:JsonProperty("item_filters", required = true) val itemFilters: kotlin.collections.List<ItemIdStoreCodePair>
) {

}

