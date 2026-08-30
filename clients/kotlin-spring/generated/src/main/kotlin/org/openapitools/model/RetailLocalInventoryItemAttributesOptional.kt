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
 * Local inventory attributes for retail items (all fields optional for update/get)
 * @param adLink Ad link for the item
 * @param availability Availability status of the item
 * @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
 * @param salePrice The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 */
data class RetailLocalInventoryItemAttributesOptional(

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

