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
 * 
 * @param productBrand Product brand. For example, \"Parker\".
 * @param productCategory Product category. For example, \"Shoes\".
 * @param productId Product ID. For example, 1414.
 * @param productName Product name. For example, \"Parker Boots\".
 * @param productPrice Product price. For example, \"99.99\".
 * @param productQuantity Product quantity. For example, 2.
 * @param productVariant Product variant. For example, \"Red\".
 * @param productVariantId Product variant ID. For example, \"1414-34832\".
 */
data class LineItem(

    @Schema(example = "Parker", description = "Product brand. For example, \"Parker\".")
    @get:JsonProperty("product_brand") val productBrand: kotlin.String? = null,

    @Schema(example = "Shoes", description = "Product category. For example, \"Shoes\".")
    @get:JsonProperty("product_category") val productCategory: kotlin.String? = null,

    @Schema(example = "1414", description = "Product ID. For example, 1414.")
    @get:JsonProperty("product_id") val productId: kotlin.Int? = null,

    @Schema(example = "Parker Boots", description = "Product name. For example, \"Parker Boots\".")
    @get:JsonProperty("product_name") val productName: kotlin.String? = null,

    @Schema(example = "99.99", description = "Product price. For example, \"99.99\".")
    @get:JsonProperty("product_price") val productPrice: kotlin.String? = null,

    @Schema(example = "2", description = "Product quantity. For example, 2.")
    @get:JsonProperty("product_quantity") val productQuantity: kotlin.Int? = null,

    @Schema(example = "Red", description = "Product variant. For example, \"Red\".")
    @get:JsonProperty("product_variant") val productVariant: kotlin.String? = null,

    @Schema(example = "1414-34832", description = "Product variant ID. For example, \"1414-34832\".")
    @get:JsonProperty("product_variant_id") val productVariantId: kotlin.String? = null
) {

}

