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
 * @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param itemPrice The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param itemName The name of a product.
 * @param itemCategory The category of a product.
 * @param itemBrand The brand of a product.
 */
data class ConversionEventsDataInnerCustomDataContentsInner(

    @Schema(example = "red-pinterest-shirt-logo-1", description = "The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "1325.12", description = "The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
    @get:JsonProperty("item_price") val itemPrice: kotlin.String? = null,

    @Schema(example = "5", description = "The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
    @get:JsonProperty("quantity") val quantity: kotlin.Long? = null,

    @Schema(example = "pinterest-clothing-shirt", description = "The name of a product.")
    @get:JsonProperty("item_name") val itemName: kotlin.String? = null,

    @Schema(example = "pinterest-entertainment", description = "The category of a product.")
    @get:JsonProperty("item_category") val itemCategory: kotlin.String? = null,

    @Schema(example = "pinterest", description = "The brand of a product.")
    @get:JsonProperty("item_brand") val itemBrand: kotlin.String? = null
    ) {

}

