package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * A pair of item_id and store_code that uniquely identifies a local inventory item
 * @param itemId Catalog item id in the merchant namespace
 * @param storeCode Store code for the local inventory item
 */
data class ItemIdStoreCodePair(

    @Schema(example = "item_id_1", required = true, description = "Catalog item id in the merchant namespace")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "store_1", required = true, description = "Store code for the local inventory item")
    @param:JsonProperty("store_code")
    @get:JsonProperty("store_code", required = true) val storeCode: kotlin.String
) {

}

