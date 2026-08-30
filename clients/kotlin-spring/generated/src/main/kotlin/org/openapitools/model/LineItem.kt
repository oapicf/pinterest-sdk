package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param productBrand Product brand. For example, 'Parker'.
 * @param productCategory Product category. For example, 'Shoes'.
 * @param productId Product ID. For example, 1414.
 * @param productName Product name. For example, 'Parker Boots'.
 * @param productPrice Product price. For example, '99.99'.
 * @param productQuantity Product quantity. For example, 2.
 * @param productVariant Product variant. For example, 'Red'.
 * @param productVariantId Product variant ID. For example, '1414-34832'.
 */
data class LineItem(

    @Schema(example = "Parker", description = "Product brand. For example, 'Parker'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_brand")
    @get:JsonProperty("product_brand") val productBrand: kotlin.String? = null,

    @Schema(example = "Shoes", description = "Product category. For example, 'Shoes'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_category")
    @get:JsonProperty("product_category") val productCategory: kotlin.String? = null,

    @Schema(example = "1414", description = "Product ID. For example, 1414.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_id")
    @get:JsonProperty("product_id") val productId: kotlin.Int? = null,

    @Schema(example = "Parker Boots", description = "Product name. For example, 'Parker Boots'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_name")
    @get:JsonProperty("product_name") val productName: kotlin.String? = null,

    @Schema(example = "99.99", description = "Product price. For example, '99.99'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_price")
    @get:JsonProperty("product_price") val productPrice: kotlin.String? = null,

    @Schema(example = "2", description = "Product quantity. For example, 2.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_quantity")
    @get:JsonProperty("product_quantity") val productQuantity: kotlin.Int? = null,

    @Schema(example = "Red", description = "Product variant. For example, 'Red'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_variant")
    @get:JsonProperty("product_variant") val productVariant: kotlin.String? = null,

    @Schema(example = "1414-34832", description = "Product variant ID. For example, '1414-34832'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_variant_id")
    @get:JsonProperty("product_variant_id") val productVariantId: kotlin.String? = null
) {

}

