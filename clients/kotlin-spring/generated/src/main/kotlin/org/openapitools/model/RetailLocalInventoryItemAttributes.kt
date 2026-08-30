package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ItemAvailability
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
 * Local inventory attributes for retail items (required fields for create/upsert)
 * @param availability Availability status of the item
 * @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
 * @param adLink Ad link for the item
 * @param salePrice The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 */
data class RetailLocalInventoryItemAttributes(

    @field:Valid
    @Schema(example = "in stock", required = true, description = "Availability status of the item")
    @param:JsonProperty("availability")
    @get:JsonProperty("availability", required = true) val availability: ItemAvailability,

    @Schema(example = "49.99 USD", required = true, description = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.")
    @param:JsonProperty("price")
    @get:JsonProperty("price", required = true) val price: kotlin.String,

    @Schema(example = "https://examplelink.com", description = "Ad link for the item")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_link")
    @get:JsonProperty("ad_link") val adLink: kotlin.String? = null,

    @Schema(example = "24.99 USD", description = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("sale_price")
    @get:JsonProperty("sale_price") val salePrice: kotlin.String? = null
) {

}

