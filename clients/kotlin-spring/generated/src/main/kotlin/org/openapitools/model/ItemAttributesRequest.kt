package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CatalogsAiContentDisclosure
import org.openapitools.model.ItemAttributesRequestImageLink
import org.openapitools.model.UpdatableItemAttributesGtin
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
 * @param adImage0Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage0Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage10Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage10Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage11Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage11Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage12Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage12Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage13Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage13Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage14Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage14Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage15Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage15Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage16Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage16Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage17Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage17Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage18Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage18Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage19Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage19Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage1Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage1Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage2Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage2Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage3Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage3Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage4Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage4Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage5Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage5Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage6Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage6Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage7Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage7Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage8Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage8Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adImage9Link Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adImage9Tag Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.
 * @param adLink Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.
 * @param adVideo0Link Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adVideo0Tag Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
 * @param adVideo1Link Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adVideo1Tag Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
 * @param adVideo2Link Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://
 * @param adVideo2Tag Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.
 * @param additionalImageLink <= 2000 characters The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.
 * @param adult Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.
 * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.
 * @param aiDisclosures AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.
 * @param androidDeepLink The deep link to the product on the Android app.
 * @param availability The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.
 * @param averageReviewRating Average reviews for the item. Can be a number from 1-5.
 * @param brand The brand of the product.
 * @param checkoutEnabled This attribute is not supported anymore.
 * @param color The primary color of the product.
 * @param condition The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.
 * @param customLabel0 <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
 * @param customLabel1 <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
 * @param customLabel2 <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
 * @param customLabel3 <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
 * @param customLabel4 <= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.
 * @param customNumber0 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customNumber1 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customNumber2 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customNumber3 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param customNumber4 An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.
 * @param description <= 10000 characters. The description of the product.
 * @param freeShippingLabel The item is free to ship.
 * @param freeShippingLimit The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.
 * @param gender The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.
 * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
 * @param gtin 
 * @param id <= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
 * @param imageLink 
 * @param installmentPrice Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>
 * @param iosDeepLink The deep link to the product on the iOS app.
 * @param itemGroupId <= 127 characters. The parent ID of the product.
 * @param lastUpdatedTime The millisecond timestamp when the item was lastly modified by the merchant.
 * @param link <= 511 characters. The landing page for the product.
 * @param material The material used to make the product.
 * @param minAdPrice The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.
 * @param mobileLink The mobile-optimized version of your landing page. Must begin with http:// or https://.
 * @param mpn Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.
 * @param numberOfRatings The number of ratings for the item.
 * @param numberOfReviews The number of reviews available for the item.
 * @param pattern The description of the pattern used for the product.
 * @param price The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
 * @param productType <= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".
 * @param promotionId A unique identifier referencing the promotion associated with this catalog item.
 * @param salePrice The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".
 * @param salePriceEffectiveDate Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)
 * @param savePinDisabled By default, product pins created from a catalog are able to be saved by Pinners. If you want to disable the save pin feature, set this attribute to true. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.
 * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
 * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric.
 * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
 * @param propertySize The size of the product.
 * @param sizeSystem Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.
 * @param sizeType Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.
 * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
 * @param title <= 500 characters. The name of the product.
 * @param unitPricingBaseMeasure Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>
 * @param unitPricingMeasure Unit pricing total measure of the product. Expected format: <total_units> <unit_type>
 * @param variantNames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
 * @param variantValues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
 * @param videoLink <= 2,000 characters Hosted link to the product video. File types for linked videos must be .mp4, .mov or .m4v. File size cannot exceed 2GB.
 */
data class ItemAttributesRequest(

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_0_link")
    @get:JsonProperty("ad_image_0_link") val adImage0Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_0_tag")
    @get:JsonProperty("ad_image_0_tag") val adImage0Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_10_link")
    @get:JsonProperty("ad_image_10_link") val adImage10Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_10_tag")
    @get:JsonProperty("ad_image_10_tag") val adImage10Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_11_link")
    @get:JsonProperty("ad_image_11_link") val adImage11Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_11_tag")
    @get:JsonProperty("ad_image_11_tag") val adImage11Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_12_link")
    @get:JsonProperty("ad_image_12_link") val adImage12Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_12_tag")
    @get:JsonProperty("ad_image_12_tag") val adImage12Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_13_link")
    @get:JsonProperty("ad_image_13_link") val adImage13Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_13_tag")
    @get:JsonProperty("ad_image_13_tag") val adImage13Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_14_link")
    @get:JsonProperty("ad_image_14_link") val adImage14Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_14_tag")
    @get:JsonProperty("ad_image_14_tag") val adImage14Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_15_link")
    @get:JsonProperty("ad_image_15_link") val adImage15Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_15_tag")
    @get:JsonProperty("ad_image_15_tag") val adImage15Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_16_link")
    @get:JsonProperty("ad_image_16_link") val adImage16Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_16_tag")
    @get:JsonProperty("ad_image_16_tag") val adImage16Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_17_link")
    @get:JsonProperty("ad_image_17_link") val adImage17Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_17_tag")
    @get:JsonProperty("ad_image_17_tag") val adImage17Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_18_link")
    @get:JsonProperty("ad_image_18_link") val adImage18Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_18_tag")
    @get:JsonProperty("ad_image_18_tag") val adImage18Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_19_link")
    @get:JsonProperty("ad_image_19_link") val adImage19Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_19_tag")
    @get:JsonProperty("ad_image_19_tag") val adImage19Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_1_link")
    @get:JsonProperty("ad_image_1_link") val adImage1Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_1_tag")
    @get:JsonProperty("ad_image_1_tag") val adImage1Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_2_link")
    @get:JsonProperty("ad_image_2_link") val adImage2Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_2_tag")
    @get:JsonProperty("ad_image_2_tag") val adImage2Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_3_link")
    @get:JsonProperty("ad_image_3_link") val adImage3Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_3_tag")
    @get:JsonProperty("ad_image_3_tag") val adImage3Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_4_link")
    @get:JsonProperty("ad_image_4_link") val adImage4Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_4_tag")
    @get:JsonProperty("ad_image_4_tag") val adImage4Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_5_link")
    @get:JsonProperty("ad_image_5_link") val adImage5Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_5_tag")
    @get:JsonProperty("ad_image_5_tag") val adImage5Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_6_link")
    @get:JsonProperty("ad_image_6_link") val adImage6Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_6_tag")
    @get:JsonProperty("ad_image_6_tag") val adImage6Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_7_link")
    @get:JsonProperty("ad_image_7_link") val adImage7Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_7_tag")
    @get:JsonProperty("ad_image_7_tag") val adImage7Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_8_link")
    @get:JsonProperty("ad_image_8_link") val adImage8Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_8_tag")
    @get:JsonProperty("ad_image_8_tag") val adImage8Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/image/image_v2.jpg", description = "Ad image link that supplements main image for shopping campaigns. Image format:- Pixel size at least 75 x 75 Link guidelines:- Include extension in file name - Do not include template or placeholder images in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_image_9_link")
    @get:JsonProperty("ad_image_9_link") val adImage9Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Ad image tag. If you provide an ad_image_x_link, include the image tag with the corresponding ad_image_x_tag attribute.")
    @param:JsonProperty("ad_image_9_tag")
    @get:JsonProperty("ad_image_9_tag") val adImage9Tag: kotlin.String? = null,

    @Schema(example = "https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest", description = "Allows advertisers to specify a separate URL that can be used to track traffic coming from Pinterest shopping ads. Must send full URL including tracking. Must begin with http:// or https://.")
    @param:JsonProperty("ad_link")
    @get:JsonProperty("ad_link") val adLink: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/video/video_v2.mov", description = "Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_video_0_link")
    @get:JsonProperty("ad_video_0_link") val adVideo0Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.")
    @param:JsonProperty("ad_video_0_tag")
    @get:JsonProperty("ad_video_0_tag") val adVideo0Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/video/video_v2.mov", description = "Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_video_1_link")
    @get:JsonProperty("ad_video_1_link") val adVideo1Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.")
    @param:JsonProperty("ad_video_1_tag")
    @get:JsonProperty("ad_video_1_tag") val adVideo1Tag: kotlin.String? = null,

    @get:Size(max=2000)
    @Schema(example = "https://www.example.com/video/video_v2.mov", description = "Restricted. Ad video link that supplements main video for shopping campaigns. Video format:- Pixel size between 75 x 75 and 9450 x 9450 - File size smaller than 2 GB - Time span between 4 seconds and 15 minutes - Accepted formats: .MP4, .MOV, .M4V Link guidelines:- Include extension in file name - Do not include template or placeholder videos in link - Make URL accessible to Pinterest user-agent - Must start with http:// or https://")
    @param:JsonProperty("ad_video_2_link")
    @get:JsonProperty("ad_video_2_link") val adVideo2Link: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "black friday", description = "Restricted. Ad video tag. If you provide an ad_video_x_link, include the video tag with the corresponding ad_video_x_tag attribute.")
    @param:JsonProperty("ad_video_2_tag")
    @get:JsonProperty("ad_video_2_tag") val adVideo2Tag: kotlin.String? = null,

    @Schema(description = "<= 2000 characters The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.")
    @param:JsonProperty("additional_image_link")
    @get:JsonProperty("additional_image_link") val additionalImageLink: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "true", description = "Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.")
    @param:JsonProperty("adult")
    @get:JsonProperty("adult") val adult: kotlin.Boolean? = null,

    @Schema(example = "newborn", description = "The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.")
    @param:JsonProperty("age_group")
    @get:JsonProperty("age_group") val ageGroup: kotlin.String? = null,

    @field:Valid
    @Schema(example = "[{\"url\":\"https://scene.example.com/image/image_v3.jpg\",\"disclosure\":[\"ai_modified\"]}]", description = "AI content disclosures for individual assets (image_link, additional_image_link, or video_link) on this item. Each entry declares which disclosure types apply to a single asset URL.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ai_disclosures")
    @get:JsonProperty("ai_disclosures") val aiDisclosures: kotlin.collections.List<CatalogsAiContentDisclosure>? = null,

    @Schema(example = "pinterest://item/1234567890", description = "The deep link to the product on the Android app.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("android_deep_link")
    @get:JsonProperty("android_deep_link") val androidDeepLink: kotlin.String? = null,

    @Schema(example = "in stock", description = "The availability of the product. Must be one of the following values (upper or lowercased): 'in stock', 'out of stock', 'preorder'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("availability")
    @get:JsonProperty("availability") val availability: kotlin.String? = null,

    @Schema(example = "5", description = "Average reviews for the item. Can be a number from 1-5.")
    @param:JsonProperty("average_review_rating")
    @get:JsonProperty("average_review_rating") val averageReviewRating: java.math.BigDecimal? = null,

    @Schema(example = "Josie's Denim", description = "The brand of the product.")
    @param:JsonProperty("brand")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @Schema(example = "false", description = "This attribute is not supported anymore.")
    @Deprecated(message = "")
    @param:JsonProperty("checkout_enabled")
    @get:JsonProperty("checkout_enabled") val checkoutEnabled: kotlin.Boolean? = null,

    @Schema(example = "blue", description = "The primary color of the product.")
    @param:JsonProperty("color")
    @get:JsonProperty("color") val color: kotlin.String? = null,

    @Schema(example = "new", description = "The condition of the product. Must be one of the following values (upper or lowercased): 'new', 'used', or 'refurbished'.")
    @param:JsonProperty("condition")
    @get:JsonProperty("condition") val condition: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "Best sellers", description = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
    @param:JsonProperty("custom_label_0")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "Summer promotion", description = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
    @param:JsonProperty("custom_label_1")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "Winter sales", description = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
    @param:JsonProperty("custom_label_2")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "Woman dress", description = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
    @param:JsonProperty("custom_label_3")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.String? = null,

    @get:Size(max=511)
    @Schema(example = "Man hat", description = "<= 511 characters for retail and creative asset catalogs, <= 127 characters for hotel catalogs. Custom grouping of products.")
    @param:JsonProperty("custom_label_4")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.String? = null,

    @Schema(example = "10", description = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
    @param:JsonProperty("custom_number_0")
    @get:JsonProperty("custom_number_0") val customNumber0: kotlin.Int? = null,

    @Schema(example = "0", description = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
    @param:JsonProperty("custom_number_1")
    @get:JsonProperty("custom_number_1") val customNumber1: kotlin.Int? = null,

    @Schema(example = "1520000000", description = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
    @param:JsonProperty("custom_number_2")
    @get:JsonProperty("custom_number_2") val customNumber2: kotlin.Int? = null,

    @Schema(example = "4294967295", description = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
    @param:JsonProperty("custom_number_3")
    @get:JsonProperty("custom_number_3") val customNumber3: kotlin.Int? = null,

    @Schema(example = "50", description = "An attribute for any integer information ranging from 0 to 4,294,967,295, which can be used to group items.")
    @param:JsonProperty("custom_number_4")
    @get:JsonProperty("custom_number_4") val customNumber4: kotlin.Int? = null,

    @Schema(example = "Casual fit denim shirt made with the finest quality Japanese denim.", description = "<= 10000 characters. The description of the product.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "true", description = "The item is free to ship.")
    @param:JsonProperty("free_shipping_label")
    @get:JsonProperty("free_shipping_label") val freeShippingLabel: kotlin.Boolean? = null,

    @Schema(example = "35 USD", description = "The minimum order purchase necessary for the customer to get free shipping. Only relevant if free shipping is offered.")
    @param:JsonProperty("free_shipping_limit")
    @get:JsonProperty("free_shipping_limit") val freeShippingLimit: kotlin.String? = null,

    @Schema(example = "unisex", description = "The gender associated with the product. Must be one of the following values (upper or lowercased): 'male', 'female', or 'unisex'.")
    @param:JsonProperty("gender")
    @get:JsonProperty("gender") val gender: kotlin.String? = null,

    @Schema(example = "Apparel & Accessories > Clothing > Shirts & Tops", description = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
    @param:JsonProperty("google_product_category")
    @get:JsonProperty("google_product_category") val googleProductCategory: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("gtin")
    @get:JsonProperty("gtin") val gtin: UpdatableItemAttributesGtin? = null,

    @Schema(example = "DS0294-L", description = "<= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.")
    @Deprecated(message = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("image_link")
    @get:JsonProperty("image_link") val imageLink: ItemAttributesRequestImageLink? = null,

    @Schema(example = "10:10.00 USD", description = "Installment price of the product. Expected format: <payment_count>:<payment_amount> <currency>")
    @param:JsonProperty("installment_price")
    @get:JsonProperty("installment_price") val installmentPrice: kotlin.String? = null,

    @Schema(example = "pinterest://item/1234567890", description = "The deep link to the product on the iOS app.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ios_deep_link")
    @get:JsonProperty("ios_deep_link") val iosDeepLink: kotlin.String? = null,

    @Schema(example = "DS0294", description = "<= 127 characters. The parent ID of the product.")
    @param:JsonProperty("item_group_id")
    @get:JsonProperty("item_group_id") val itemGroupId: kotlin.String? = null,

    @Schema(example = "1641483432072", description = "The millisecond timestamp when the item was lastly modified by the merchant.")
    @param:JsonProperty("last_updated_time")
    @get:JsonProperty("last_updated_time") val lastUpdatedTime: kotlin.Long? = null,

    @Schema(example = "https://www.example.com/cat/womens-clothing/denim-shirt-0294", description = "<= 511 characters. The landing page for the product.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(example = "cotton", description = "The material used to make the product.")
    @param:JsonProperty("material")
    @get:JsonProperty("material") val material: kotlin.String? = null,

    @Schema(example = "19.99 USD", description = "The minimum advertised price of the product. It supports the following formats: \"19.99 USD\", \"19.99USD\" and \"19.99\". If the currency is not included, we default to US dollars.")
    @param:JsonProperty("min_ad_price")
    @get:JsonProperty("min_ad_price") val minAdPrice: kotlin.String? = null,

    @Schema(example = "https://m.example.com/cat/womens-clothing/denim-shirt-0294", description = "The mobile-optimized version of your landing page. Must begin with http:// or https://.")
    @param:JsonProperty("mobile_link")
    @get:JsonProperty("mobile_link") val mobileLink: kotlin.String? = null,

    @Schema(example = "PI12345NTEREST", description = "Manufacturer Part Number are alpha-numeric codes created by the manufacturer of a product to uniquely identify it among all products from the same manufacturer.")
    @param:JsonProperty("mpn")
    @get:JsonProperty("mpn") val mpn: kotlin.String? = null,

    @Schema(example = "10", description = "The number of ratings for the item.")
    @param:JsonProperty("number_of_ratings")
    @get:JsonProperty("number_of_ratings") val numberOfRatings: kotlin.Int? = null,

    @Schema(example = "10", description = "The number of reviews available for the item.")
    @param:JsonProperty("number_of_reviews")
    @get:JsonProperty("number_of_reviews") val numberOfReviews: kotlin.Int? = null,

    @Schema(example = "plaid", description = "The description of the pattern used for the product.")
    @param:JsonProperty("pattern")
    @get:JsonProperty("pattern") val pattern: kotlin.String? = null,

    @Schema(example = "24.99 USD", description = "The price of the product. It supports the following formats: \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("price")
    @get:JsonProperty("price") val price: kotlin.String? = null,

    @Schema(example = "Clothing > Women's > Shirts > Denim", description = "<= 1000 characters. The categorization of your product based on your custom product taxonomy. Subcategories must be sent separated by \" > \".")
    @param:JsonProperty("product_type")
    @get:JsonProperty("product_type") val productType: kotlin.String? = null,

    @Schema(example = "promotion_1", description = "A unique identifier referencing the promotion associated with this catalog item.")
    @param:JsonProperty("promotion_id")
    @get:JsonProperty("promotion_id") val promotionId: kotlin.String? = null,

    @Schema(example = "14.99 USD", description = "The discounted price of the product. The sale_price must be lower than the price. It supports the following formats: \"14.99 USD\", \"14.99USD\" and \"14.99\".")
    @param:JsonProperty("sale_price")
    @get:JsonProperty("sale_price") val salePrice: kotlin.String? = null,

    @Schema(example = "2025-01-01T00:00:00.000000Z/2025-01-07T00:00:00.000000Z", description = "Sale price effective date. Expected format: <start_date>/<end_date> (ISO 8601 format)")
    @param:JsonProperty("sale_price_effective_date")
    @get:JsonProperty("sale_price_effective_date") val salePriceEffectiveDate: kotlin.String? = null,

    @Schema(description = "By default, product pins created from a catalog are able to be saved by Pinners. If you want to disable the save pin feature, set this attribute to true. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("save_pin_disabled")
    @get:JsonProperty("save_pin_disabled") val savePinDisabled: kotlin.Boolean? = false,

    @Schema(example = "US:CA:Ground:0 USD", description = "Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.")
    @param:JsonProperty("shipping")
    @get:JsonProperty("shipping") val shipping: kotlin.String? = null,

    @Schema(example = "12 in", description = "The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
    @param:JsonProperty("shipping_height")
    @get:JsonProperty("shipping_height") val shippingHeight: kotlin.String? = null,

    @Schema(example = "3 kg", description = "The weight of the product. Ensure there is a space between the numeric string and the metric.")
    @param:JsonProperty("shipping_weight")
    @get:JsonProperty("shipping_weight") val shippingWeight: kotlin.String? = null,

    @Schema(example = "16 in", description = "The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.")
    @param:JsonProperty("shipping_width")
    @get:JsonProperty("shipping_width") val shippingWidth: kotlin.String? = null,

    @Schema(example = "M", description = "The size of the product.")
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: kotlin.String? = null,

    @Schema(example = "US", description = "Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.")
    @param:JsonProperty("size_system")
    @get:JsonProperty("size_system") val sizeSystem: kotlin.String? = null,

    @Schema(example = "regular", description = "Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.")
    @param:JsonProperty("size_type")
    @get:JsonProperty("size_type") val sizeType: kotlin.String? = null,

    @Schema(example = "US:1025433:6.00:y", description = "Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.")
    @param:JsonProperty("tax")
    @get:JsonProperty("tax") val tax: kotlin.String? = null,

    @Schema(example = "Women's denim shirt, large", description = "<= 500 characters. The name of the product.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("title")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "10 ML", description = "Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>")
    @param:JsonProperty("unit_pricing_base_measure")
    @get:JsonProperty("unit_pricing_base_measure") val unitPricingBaseMeasure: kotlin.String? = null,

    @Schema(example = "10 ML", description = "Unit pricing total measure of the product. Expected format: <total_units> <unit_type>")
    @param:JsonProperty("unit_pricing_measure")
    @get:JsonProperty("unit_pricing_measure") val unitPricingMeasure: kotlin.String? = null,

    @Schema(example = "[\"Color\",\"Size\"]", description = "Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.")
    @param:JsonProperty("variant_names")
    @get:JsonProperty("variant_names") val variantNames: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "[\"Red\",\"Small\"]", description = "Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.")
    @param:JsonProperty("variant_values")
    @get:JsonProperty("variant_values") val variantValues: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "<= 2,000 characters Hosted link to the product video. File types for linked videos must be .mp4, .mov or .m4v. File size cannot exceed 2GB.")
    @param:JsonProperty("video_link")
    @get:JsonProperty("video_link") val videoLink: kotlin.String? = null
) {

}

