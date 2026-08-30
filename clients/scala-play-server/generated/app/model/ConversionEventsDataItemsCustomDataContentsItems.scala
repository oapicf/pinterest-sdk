package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionEventsDataItemsCustomDataContentsItems.
  * @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  * @param itemBrand The brand of a product.
  * @param itemBrandId The brand ID of a product.
  * @param itemCategory The category of a product.
  * @param itemName The name of a product.
  * @param itemPrice The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  * @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ConversionEventsDataItemsCustomDataContentsItems(
  id: Option[String],
  itemBrand: Option[String],
  itemBrandId: Option[String],
  itemCategory: Option[String],
  itemName: Option[String],
  itemPrice: Option[String],
  quantity: Option[Long]
)

object ConversionEventsDataItemsCustomDataContentsItems {
  implicit lazy val conversionEventsDataItemsCustomDataContentsItemsJsonFormat: Format[ConversionEventsDataItemsCustomDataContentsItems] = Json.format[ConversionEventsDataItemsCustomDataContentsItems]
}

