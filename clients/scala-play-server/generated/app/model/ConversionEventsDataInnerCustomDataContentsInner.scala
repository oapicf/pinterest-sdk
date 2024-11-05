package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEvents_data_inner_custom_data_contents_inner.
  * @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  * @param itemPrice The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  * @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  * @param itemName The name of a product.
  * @param itemCategory The category of a product.
  * @param itemBrand The brand of a product.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ConversionEventsDataInnerCustomDataContentsInner(
  id: Option[String],
  itemPrice: Option[String],
  quantity: Option[Long],
  itemName: Option[String],
  itemCategory: Option[String],
  itemBrand: Option[String]
)

object ConversionEventsDataInnerCustomDataContentsInner {
  implicit lazy val conversionEventsDataInnerCustomDataContentsInnerJsonFormat: Format[ConversionEventsDataInnerCustomDataContentsInner] = Json.format[ConversionEventsDataInnerCustomDataContentsInner]
}

