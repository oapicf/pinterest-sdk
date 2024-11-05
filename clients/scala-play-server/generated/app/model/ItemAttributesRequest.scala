package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemAttributesRequest.
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
  * @param size The size of the product.
  * @param sizeSystem Indicates the country’s sizing system in which you are submitting your product. Must be one of the following values (upper or lowercased): ‘US’, ‘UK’, ‘EU’, ‘DE’ , ‘FR’, ‘JP’, ‘CN’, ‘IT’, ‘ BR’, ‘MEX’, or ‘AU’.
  * @param sizeType Additional description for the size. Must be one of the following values (upper or lowercased): ‘regular’, ‘petite’ , ‘plus’, ‘big_and_tall’, or ‘maternity’.
  * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  * @param title <p><= 500 characters</p> <p>The name of the product.</p>
  * @param variantNames Options for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed.
  * @param variantValues Option values for this variant. People will see these options next to your Pin and can select the one they want. List them in the order you want them displayed. The order of the variant values must be consistent with the order of the variant names.
  * @param additionalImageLink <p><= 2000 characters</p> <p>The links to additional images for your product. Up to ten additional images can be used to show a product from different angles or to show different stages. Must begin with http:// or https://.</p>
  * @param videoLink <p><= 2,000 characters</p> <p>Hosted link to the product video.</p> <p>File types for linked videos must be .mp4, .mov or .m4v.</p> <p>File size cannot exceed 2GB.</p>
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemAttributesRequest(
  adLink: Option[String],
  adult: Option[Boolean],
  ageGroup: Option[String],
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
  description: Option[String],
  freeShippingLabel: Option[Boolean],
  freeShippingLimit: Option[String],
  gender: Option[String],
  googleProductCategory: Option[String],
  gtin: Option[Int],
  id: Option[String],
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
  salePrice: Option[String],
  shipping: Option[String],
  shippingHeight: Option[String],
  shippingWeight: Option[String],
  shippingWidth: Option[String],
  size: Option[String],
  sizeSystem: Option[String],
  sizeType: Option[String],
  tax: Option[String],
  title: Option[String],
  variantNames: Option[List[String]],
  variantValues: Option[List[String]],
  additionalImageLink: Option[List[String]],
  imageLink: Option[ItemAttributesRequestAllOfImageLink],
  videoLink: Option[String]
  additionalProperties: 
)

object ItemAttributesRequest {
  implicit lazy val itemAttributesRequestJsonFormat: Format[ItemAttributesRequest] = {
    val realJsonFormat = Json.format[ItemAttributesRequest]
    val declaredPropNames = Set("adLink", "adult", "ageGroup", "availability", "averageReviewRating", "brand", "checkoutEnabled", "color", "condition", "customLabel0", "customLabel1", "customLabel2", "customLabel3", "customLabel4", "description", "freeShippingLabel", "freeShippingLimit", "gender", "googleProductCategory", "gtin", "id", "itemGroupId", "lastUpdatedTime", "link", "material", "minAdPrice", "mobileLink", "mpn", "numberOfRatings", "numberOfReviews", "pattern", "price", "productType", "salePrice", "shipping", "shippingHeight", "shippingWeight", "shippingWidth", "size", "sizeSystem", "sizeType", "tax", "title", "variantNames", "variantValues", "additionalImageLink", "imageLink", "videoLink")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { itemAttributesRequest =>
        val jsObj = realJsonFormat.writes(itemAttributesRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

