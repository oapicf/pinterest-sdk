package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ItemAvailability
import org.openapitools.model.StoreMetadata
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
 * Local inventory item response
 * @param createdAt The millisecond timestamp when the local inventory item was created
 * @param itemId The catalog item id in the merchant namespace
 * @param lastUpdatedTime The millisecond timestamp when the local inventory item was lastly modified by the merchant.
 * @param storeMetadata Store metadata for this local inventory item
 * @param adLink Ad link for the item
 * @param availability Availability status of the item
 * @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
 * @param salePrice The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 */
data class LocalInventoryItemResponse(

    @Schema(example = "1641483432072", required = true, description = "The millisecond timestamp when the local inventory item was created")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: kotlin.Long,

    @Schema(example = "DS0294-M", required = true, description = "The catalog item id in the merchant namespace")
    @param:JsonProperty("item_id")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "1641483432072", required = true, description = "The millisecond timestamp when the local inventory item was lastly modified by the merchant.")
    @param:JsonProperty("last_updated_time")
    @get:JsonProperty("last_updated_time", required = true) val lastUpdatedTime: kotlin.Long,

    @field:Valid
    @Schema(required = true, description = "Store metadata for this local inventory item")
    @param:JsonProperty("store_metadata")
    @get:JsonProperty("store_metadata", required = true) val storeMetadata: StoreMetadata,

    @Schema(example = "https://examplelink.com", description = "Ad link for the item")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_link")
    @get:JsonProperty("ad_link") val adLink: kotlin.String? = null,

    @field:Valid
    @Schema(example = "in stock", description = "Availability status of the item")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("availability")
    @get:JsonProperty("availability") val availability: ItemAvailability? = null,

    @Schema(example = "49.99 USD", description = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("price")
    @get:JsonProperty("price") val price: kotlin.String? = null,

    @Schema(example = "24.99 USD", description = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sale_price")
    @get:JsonProperty("sale_price") val salePrice: kotlin.String? = null
) {

}

