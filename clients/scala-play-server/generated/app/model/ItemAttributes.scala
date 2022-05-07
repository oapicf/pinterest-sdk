package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ItemAttributes.
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
  * @param size The size of the product.
  * @param sizeSystem Indicates the country’s sizing system in which you are submitting your product.
  * @param sizeType Additional description for the size. Must be one of the following values: ‘regular’, ‘petite’, ‘plus’, ‘big_and_tall’, ‘maternity’.
  * @param tax Tax consists of one group of up to four elements, country, region, rate (all required) and tax_ship (optional). All colons, even for blank values, are required.
  * @param title The name of the product.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class ItemAttributes(
  adLink: Option[String],
  additionalImageLink: Option[List[String]],
  adult: Option[Boolean],
  ageGroup: Option[String],
  availability: Option[String],
  averageReviewRating: Option[BigDecimal],
  brand: Option[String],
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
  imageLink: Option[List[String]],
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
  title: Option[String]
  additionalProperties: 
)

object ItemAttributes {
  implicit lazy val itemAttributesJsonFormat: Format[ItemAttributes] = {
    val realJsonFormat = Json.format[ItemAttributes]
    val declaredPropNames = Set("adLink", "additionalImageLink", "adult", "ageGroup", "availability", "averageReviewRating", "brand", "color", "condition", "customLabel0", "customLabel1", "customLabel2", "customLabel3", "customLabel4", "description", "freeShippingLabel", "freeShippingLimit", "gender", "googleProductCategory", "gtin", "id", "imageLink", "itemGroupId", "lastUpdatedTime", "link", "material", "minAdPrice", "mobileLink", "mpn", "numberOfRatings", "numberOfReviews", "pattern", "price", "productType", "salePrice", "shipping", "shippingHeight", "shippingWeight", "shippingWidth", "size", "sizeSystem", "sizeType", "tax", "title")
    
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
      Writes { itemAttributes =>
        val jsObj = realJsonFormat.writes(itemAttributes)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

