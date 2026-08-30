package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventsDataItemsCustomDataContentsItems(
    /** The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    val id: kotlin.String? = null,
    /** The brand of a product. */
    val itemBrand: kotlin.String? = null,
    /** The brand ID of a product. */
    val itemBrandId: kotlin.String? = null,
    /** The category of a product. */
    val itemCategory: kotlin.String? = null,
    /** The name of a product. */
    val itemName: kotlin.String? = null,
    /** The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    val itemPrice: kotlin.String? = null,
    /** The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    val quantity: kotlin.Long? = null
)
