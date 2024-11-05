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
 * @param adLink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.
 * @param adult Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.
 * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.
 * @param availability The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.
 * @param averageReviewRating Average reviews for the item. Can be a number from 1-5.
 * @param brand The brand of the product.
 * @param checkoutEnabled This attribute is not supported anymore.
 * @param color The primary color of the product.
 * @param condition The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.
 * @param customLabel0 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customLabel1 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customLabel2 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customLabel3 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param customLabel4 <p><= 1000 characters</p> <p>Custom grouping of products.</p>
 * @param description <p><= 10000 characters</p> <p>The description of the product.</p>
 * @param freeShippingLabel The item is free to ship.
 * @param freeShippingLimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
 * @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.
 * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param gtin The unique universal product identifier.
 * @param id <p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>
 * @param itemGroupId <p><= 127 characters</p> <p>The parent ID of the product.</p>
 * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
 * @param link <p><= 511 characters</p> <p>The landing page for the product.</p>
 * @param material The material used to make the product.
 * @param minAdPrice The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
 * @param mobileLink The mobile-optimized version of your landing page. Must begin with http:// or https://.
 * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
 * @param numberOfRatings The number of ratings for the item.
 * @param numberOfReviews The number of reviews available for the item.
 * @param pattern The description of the pattern used for the product.
 * @param price The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 * @param productType <p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>
 * @param salePrice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.
 * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
 * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param propertySize The size of the product.
 * @param sizeSystem Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
 * @param sizeType Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
 * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
 * @param title <p><= 500 characters</p> <p>The name of the product.</p>
 * @param variantNames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
 * @param variantValues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
 * @param additionalImageLink <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
 * @param imageLink <p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
 * @param videoLink <p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>
 */
data class ItemAttributes(

    @Schema(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", description = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking—do not send tracking parameters only. At this time we do not support impression tracking. Must begin with http:// or https://.")
    @get:JsonProperty("ad_link") val adLink: kotlin.String? = null,

    @Schema(example = "true", description = "Set this attribute to TRUE if you're submitting items that are considered “adult”. These will not be shown on Pinterest.")
    @get:JsonProperty("adult") val adult: kotlin.Boolean? = null,

    @Schema(example = "newborn", description = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): ‘newborn’ , ‘infant’, ‘toddler’, ‘kids’, or ‘adult’.")
    @get:JsonProperty("age_group") val ageGroup: kotlin.String? = null,

    @Schema(example = "in stock", description = "The availability of the product. Must be one of the following values (upper or lowercased): ‘in stock’, ‘out of stock’ , ‘preorder’.")
    @get:JsonProperty("availability") val availability: kotlin.String? = null,

    @Schema(example = "5", description = "Average reviews for the item. Can be a number from 1-5.")
    @get:JsonProperty("average_review_rating") val averageReviewRating: java.math.BigDecimal? = null,

    @Schema(example = "Josie’s Denim", description = "The brand of the product.")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @Schema(example = "false", description = "This attribute is not supported anymore.")
    @Deprecated(message = "")
    @get:JsonProperty("checkout_enabled") val checkoutEnabled: kotlin.Boolean? = null,

    @Schema(example = "blue", description = "The primary color of the product.")
    @get:JsonProperty("color") val color: kotlin.String? = null,

    @Schema(example = "new", description = "The condition of the product. Must be one of the following values (upper or lowercased): ‘new’, ‘used’, or ‘refurbished’.")
    @get:JsonProperty("condition") val condition: kotlin.String? = null,

    @Schema(example = "Best sellers", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.String? = null,

    @Schema(example = "Summer promotion", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.String? = null,

    @Schema(example = "Winter sales", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.String? = null,

    @Schema(example = "Woman dress", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.String? = null,

    @Schema(example = "Man hat", description = "<p><= 1000 characters</p> <p>Custom grouping of products.</p>")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.String? = null,

    @Schema(example = "Casual fit denim shirt made with the finest quality Japanese denim.", description = "<p><= 10000 characters</p> <p>The description of the product.</p>")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "true", description = "The item is free to ship.")
    @get:JsonProperty("free_shipping_label") val freeShippingLabel: kotlin.Boolean? = null,

    @Schema(example = "35 USD", description = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
    @get:JsonProperty("free_shipping_limit") val freeShippingLimit: kotlin.String? = null,

    @Schema(example = "unisex", description = "The gender associated with the product. Must be one of the following values (upper or lowercased): ‘male’, ‘female’ , or ‘unisex’.")
    @get:JsonProperty("gender") val gender: kotlin.String? = null,

    @Schema(example = "Apparel & Accessories > Clothing > Shirts & Tops", description = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
    @get:JsonProperty("google_product_category") val googleProductCategory: kotlin.String? = null,

    @Schema(example = "3234567890126", description = "The unique universal product identifier.")
    @get:JsonProperty("gtin") val gtin: kotlin.Int? = null,

    @Schema(example = "DS0294-L", description = "<p><= 127 characters</p> <p>The user-created unique ID that represents the product. Only Unicode characters are accepted.</p>")
    @Deprecated(message = "")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "DS0294", description = "<p><= 127 characters</p> <p>The parent ID of the product.</p>")
    @get:JsonProperty("item_group_id") val itemGroupId: kotlin.String? = null,

    @Schema(example = "1641483432072", description = "The millisecond timestamp when the item was lastly modified by the merchant.")
    @get:JsonProperty("last_updated_time") val lastUpdatedTime: kotlin.Long? = null,

    @Schema(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", description = "<p><= 511 characters</p> <p>The landing page for the product.</p>")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(example = "cotton", description = "The material used to make the product.")
    @get:JsonProperty("material") val material: kotlin.String? = null,

    @Schema(example = "19.99 USD", description = "The minimum advertised price of the product. It supports the following formats, \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
    @get:JsonProperty("min_ad_price") val minAdPrice: kotlin.String? = null,

    @Schema(example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", description = "The mobile-optimized version of your landing page. Must begin with http:// or https://.")
    @get:JsonProperty("mobile_link") val mobileLink: kotlin.String? = null,

    @Schema(example = "PI12345NTEREST", description = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.")
    @get:JsonProperty("mpn") val mpn: kotlin.String? = null,

    @Schema(example = "10", description = "The number of ratings for the item.")
    @get:JsonProperty("number_of_ratings") val numberOfRatings: kotlin.Int? = null,

    @Schema(example = "10", description = "The number of reviews available for the item.")
    @get:JsonProperty("number_of_reviews") val numberOfReviews: kotlin.Int? = null,

    @Schema(example = "plaid", description = "The description of the pattern used for the product.")
    @get:JsonProperty("pattern") val pattern: kotlin.String? = null,

    @Schema(example = "24.99 USD", description = "The price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
    @get:JsonProperty("price") val price: kotlin.String? = null,

    @Schema(example = "Clothing > Women’s > Shirts > Denim", description = "<p><= 1000 characters</p> <p>The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by “ > “. The > must be wrapped by spaces. We do not recognize any other delimiters such as comma or pipe.</p>")
    @get:JsonProperty("product_type") val productType: kotlin.String? = null,

    @Schema(example = "14.99 USD", description = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats, \"14.99 USD\", \"14.99USD\" and \"14.99\". If the currency is not included, we default to US dollars.")
    @get:JsonProperty("sale_price") val salePrice: kotlin.String? = null,

    @Schema(example = "US:CA:Ground:0 USD", description = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.")
    @get:JsonProperty("shipping") val shipping: kotlin.String? = null,

    @Schema(example = "12 in", description = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
    @get:JsonProperty("shipping_height") val shippingHeight: kotlin.String? = null,

    @Schema(example = "3 kg", description = "The weight of the product. Ensure there is a space between the numeric string and the metric.")
    @get:JsonProperty("shipping_weight") val shippingWeight: kotlin.String? = null,

    @Schema(example = "16 in", description = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
    @get:JsonProperty("shipping_width") val shippingWidth: kotlin.String? = null,

    @Schema(example = "M", description = "The size of the product.")
    @get:JsonProperty("size") val propertySize: kotlin.String? = null,

    @Schema(example = "US", description = "Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.")
    @get:JsonProperty("size_system") val sizeSystem: kotlin.String? = null,

    @Schema(example = "regular", description = "Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.")
    @get:JsonProperty("size_type") val sizeType: kotlin.String? = null,

    @Schema(example = "US:1025433:6.00:y", description = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
    @get:JsonProperty("tax") val tax: kotlin.String? = null,

    @Schema(example = "Women’s denim shirt, large", description = "<p><= 500 characters</p> <p>The name of the product.</p>")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "[Color, Size]", description = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.")
    @get:JsonProperty("variant_names") val variantNames: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "[Red, Small]", description = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.")
    @get:JsonProperty("variant_values") val variantValues: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "[\"https://scene.example.com/image/image_v2.jpg\",\"https://scene.example.com/image/image_v3.jpg\"]", description = "<p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>")
    @get:JsonProperty("additional_image_link") val additionalImageLink: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(min=1)
    @Schema(example = "[\"https://scene.example.com/image/image.jpg\"]", description = "<p><= 2000 characters</p> <p>The link to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>")
    @get:JsonProperty("image_link") val imageLink: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294.mp4", description = "<p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>")
    @get:JsonProperty("video_link") val videoLink: kotlin.String? = null
    ) {

}

