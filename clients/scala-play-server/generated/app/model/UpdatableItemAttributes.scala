package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatableItemAttributes.
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
  * @param adult Set this attribute to TRUE if you're submitting items that are considered \"adult\". These will not be shown on Pinterest.
  * @param ageGroup The age group to apply a demographic range to the product. Must be one of the following values (upper or lowercased): 'newborn', 'infant', 'toddler', 'kids', or 'adult'.
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
  * @param id <= 127 characters. The user-created unique ID that represents the product. Only Unicode characters are accepted.
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
  * @param shipping Shipping consists of one group of up to four elements, country, region, service (all optional) and price (required). All colons, even for blank values, are required.
  * @param shippingHeight The height of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  * @param shippingWeight The weight of the product. Ensure there is a space between the numeric string and the metric.
  * @param shippingWidth The width of the package needed to ship the product. Ensure there is a space between the numeric string and the metric.
  * @param size The size of the product.
  * @param sizeSystem Indicates the country's sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): 'US', 'UK', 'EU', 'DE', 'FR', 'JP', 'CN', 'IT', 'BR', 'MEX', or 'AU'.
  * @param sizeType Additional description for the size. Must be one of the following values (upper or lowercased): 'regular', 'petite', 'plus', 'big_and_tall', or 'maternity'.
  * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  * @param title <= 500 characters. The name of the product.
  * @param unitPricingBaseMeasure Unit pricing base measure of the product. Expected format: <base_measure> <unit_type>
  * @param unitPricingMeasure Unit pricing total measure of the product. Expected format: <total_units> <unit_type>
  * @param variantNames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  * @param variantValues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class UpdatableItemAttributes(
  adImage0Link: Option[String],
  adImage0Tag: Option[String],
  adImage10Link: Option[String],
  adImage10Tag: Option[String],
  adImage11Link: Option[String],
  adImage11Tag: Option[String],
  adImage12Link: Option[String],
  adImage12Tag: Option[String],
  adImage13Link: Option[String],
  adImage13Tag: Option[String],
  adImage14Link: Option[String],
  adImage14Tag: Option[String],
  adImage15Link: Option[String],
  adImage15Tag: Option[String],
  adImage16Link: Option[String],
  adImage16Tag: Option[String],
  adImage17Link: Option[String],
  adImage17Tag: Option[String],
  adImage18Link: Option[String],
  adImage18Tag: Option[String],
  adImage19Link: Option[String],
  adImage19Tag: Option[String],
  adImage1Link: Option[String],
  adImage1Tag: Option[String],
  adImage2Link: Option[String],
  adImage2Tag: Option[String],
  adImage3Link: Option[String],
  adImage3Tag: Option[String],
  adImage4Link: Option[String],
  adImage4Tag: Option[String],
  adImage5Link: Option[String],
  adImage5Tag: Option[String],
  adImage6Link: Option[String],
  adImage6Tag: Option[String],
  adImage7Link: Option[String],
  adImage7Tag: Option[String],
  adImage8Link: Option[String],
  adImage8Tag: Option[String],
  adImage9Link: Option[String],
  adImage9Tag: Option[String],
  adLink: Option[String],
  adVideo0Link: Option[String],
  adVideo0Tag: Option[String],
  adVideo1Link: Option[String],
  adVideo1Tag: Option[String],
  adVideo2Link: Option[String],
  adVideo2Tag: Option[String],
  adult: Option[Boolean],
  ageGroup: Option[String],
  androidDeepLink: Option[String],
  availability: Option[String],
  averageReviewRating: Option[BigDecimal],
  brand: Option[String],
  checkoutEnabled: Option[Boolean],
  color: Option[String],
  condition: Option[String],
  customLabel0: Option[String],
  customLabel1: Option[String],
  customLabel2: Option[String],
  customLabel3: Option[String],
  customLabel4: Option[String],
  customNumber0: Option[Int],
  customNumber1: Option[Int],
  customNumber2: Option[Int],
  customNumber3: Option[Int],
  customNumber4: Option[Int],
  description: Option[String],
  freeShippingLabel: Option[Boolean],
  freeShippingLimit: Option[String],
  gender: Option[String],
  googleProductCategory: Option[String],
  gtin: Option[UpdatableItemAttributesGtin],
  id: Option[String],
  installmentPrice: Option[String],
  iosDeepLink: Option[String],
  itemGroupId: Option[String],
  lastUpdatedTime: Option[Long],
  link: Option[String],
  material: Option[String],
  minAdPrice: Option[String],
  mobileLink: Option[String],
  mpn: Option[String],
  numberOfRatings: Option[Int],
  numberOfReviews: Option[Int],
  pattern: Option[String],
  price: Option[String],
  productType: Option[String],
  promotionId: Option[String],
  salePrice: Option[String],
  salePriceEffectiveDate: Option[String],
  shipping: Option[String],
  shippingHeight: Option[String],
  shippingWeight: Option[String],
  shippingWidth: Option[String],
  size: Option[String],
  sizeSystem: Option[String],
  sizeType: Option[String],
  tax: Option[String],
  title: Option[String],
  unitPricingBaseMeasure: Option[String],
  unitPricingMeasure: Option[String],
  variantNames: Option[List[String]],
  variantValues: Option[List[String]]
)

object UpdatableItemAttributes {
  implicit lazy val updatableItemAttributesJsonFormat: Format[UpdatableItemAttributes] = Json.format[UpdatableItemAttributes]
}

