package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param adLink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
 * @param additionalImageLink The links to additional images for your product. Up to five additional images can be used to show a product from different angles or to show different stages. Separate each additional image with a comma. We recommend enclosing the whole string with quotes. Must begin with http:// or https://
 * @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
 * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values: ‘newborn’, ‘infant’, ‘toddler’, ‘kids’, ‘adult’.
 * @param availability The availability of the product. Must be one of the following values: ‘in stock’, ‘out of stock’, ‘preorder’.
 * @param averageReviewRating Average reviews for the item. Can be a number from 1-5.
 * @param brand The brand of the product.
 * @param color The primary color of the product.
 * @param condition The condition of the product. Must be one of the following values: ‘new’, ‘used’, ‘refurbished’.
 * @param customLabel0 Custom grouping of products.
 * @param customLabel1 Custom grouping of products.
 * @param customLabel2 Custom grouping of products.
 * @param customLabel3 Custom grouping of products.
 * @param customLabel4 Custom grouping of products.
 * @param description The description of the product.
 * @param freeShippingLabel The item is free to ship.
 * @param freeShippingLimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
 * @param gender The gender associated with the product. Must be one of the following values: ‘male’, ‘female’, ‘unisex’.
 * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param gtin The unique universal product identifier.
 * @param id The user-created unique ID that represents the product. Only Unicode characters are accepted.
 * @param imageLink The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://
 * @param itemGroupId The parent ID of the product.
 * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
 * @param link The landing page for the product.
 * @param material The material used to make the product.
 * @param minAdPrice The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
 * @param mobileLink The mobile-optimized version of your landing page. Must begin with http:// or https://.
 * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
 * @param numberOfRatings The number of ratings for the item.
 * @param numberOfReviews The number of reviews available for the item.
 * @param pattern The description of the pattern used for the product.
 * @param price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 * @param productType The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.
 * @param salePrice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
 * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
 * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param propertySize The size of the product.
 * @param sizeSystem Indicates the country’s sizing system in which you are submitting your product.
 * @param sizeType Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
 * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
 * @param title The name of the product.
 */
data class ItemAttributes(

    @field:JsonProperty("ad_link") val adLink: kotlin.String? = null,

    @field:JsonProperty("additional_image_link") val additionalImageLink: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("adult") val adult: kotlin.Boolean? = null,

    @field:JsonProperty("age_group") val ageGroup: kotlin.String? = null,

    @field:JsonProperty("availability") val availability: kotlin.String? = null,

    @field:JsonProperty("average_review_rating") val averageReviewRating: java.math.BigDecimal? = null,

    @field:JsonProperty("brand") val brand: kotlin.String? = null,

    @field:JsonProperty("color") val color: kotlin.String? = null,

    @field:JsonProperty("condition") val condition: kotlin.String? = null,

    @get:Size(max=1000)
    @field:JsonProperty("custom_label_0") val customLabel0: kotlin.String? = null,

    @get:Size(max=1000)
    @field:JsonProperty("custom_label_1") val customLabel1: kotlin.String? = null,

    @get:Size(max=1000)
    @field:JsonProperty("custom_label_2") val customLabel2: kotlin.String? = null,

    @get:Size(max=1000)
    @field:JsonProperty("custom_label_3") val customLabel3: kotlin.String? = null,

    @get:Size(max=1000)
    @field:JsonProperty("custom_label_4") val customLabel4: kotlin.String? = null,

    @get:Size(max=10000)
    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("free_shipping_label") val freeShippingLabel: kotlin.Boolean? = null,

    @field:JsonProperty("free_shipping_limit") val freeShippingLimit: kotlin.String? = null,

    @field:JsonProperty("gender") val gender: kotlin.String? = null,

    @field:JsonProperty("google_product_category") val googleProductCategory: kotlin.String? = null,

    @field:JsonProperty("gtin") val gtin: kotlin.Int? = null,

    @get:Size(max=127)
    @field:JsonProperty("id") val id: kotlin.String? = null,

    @get:Size(min=1)
    @field:JsonProperty("image_link") val imageLink: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(max=127)
    @field:JsonProperty("item_group_id") val itemGroupId: kotlin.String? = null,

    @field:JsonProperty("last_updated_time") val lastUpdatedTime: kotlin.Long? = null,

    @get:Size(max=511)
    @field:JsonProperty("link") val link: kotlin.String? = null,

    @field:JsonProperty("material") val material: kotlin.String? = null,

    @field:JsonProperty("min_ad_price") val minAdPrice: kotlin.String? = null,

    @field:JsonProperty("mobile_link") val mobileLink: kotlin.String? = null,

    @field:JsonProperty("mpn") val mpn: kotlin.String? = null,

    @field:JsonProperty("number_of_ratings") val numberOfRatings: kotlin.Int? = null,

    @field:JsonProperty("number_of_reviews") val numberOfReviews: kotlin.Int? = null,

    @field:JsonProperty("pattern") val pattern: kotlin.String? = null,

    @field:JsonProperty("price") val price: kotlin.String? = null,

    @get:Size(max=1000)
    @field:JsonProperty("product_type") val productType: kotlin.String? = null,

    @field:JsonProperty("sale_price") val salePrice: kotlin.String? = null,

    @field:JsonProperty("shipping") val shipping: kotlin.String? = null,

    @field:JsonProperty("shipping_height") val shippingHeight: kotlin.String? = null,

    @field:JsonProperty("shipping_weight") val shippingWeight: kotlin.String? = null,

    @field:JsonProperty("shipping_width") val shippingWidth: kotlin.String? = null,

    @field:JsonProperty("size") val propertySize: kotlin.String? = null,

    @field:JsonProperty("size_system") val sizeSystem: kotlin.String? = null,

    @field:JsonProperty("size_type") val sizeType: kotlin.String? = null,

    @field:JsonProperty("tax") val tax: kotlin.String? = null,

    @get:Size(max=500)
    @field:JsonProperty("title") val title: kotlin.String? = null
) {

}

