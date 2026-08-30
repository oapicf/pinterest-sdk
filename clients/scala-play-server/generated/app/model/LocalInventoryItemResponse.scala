package model

import play.api.libs.json._

/**
  * Local inventory item response
  * @param adLink Ad link for the item
  * @param availability Availability status of the item
  * @param createdAt The millisecond timestamp when the local inventory item was created
  * @param itemId The catalog item id in the merchant namespace
  * @param lastUpdatedTime The millisecond timestamp when the local inventory item was lastly modified by the merchant.
  * @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  * @param salePrice The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  * @param storeMetadata Store metadata for this local inventory item
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalInventoryItemResponse(
  adLink: Option[String],
  availability: Option[ItemAvailability],
  createdAt: Long,
  itemId: String,
  lastUpdatedTime: Long,
  price: Option[String],
  salePrice: Option[String],
  storeMetadata: StoreMetadata
)

object LocalInventoryItemResponse {
  implicit lazy val localInventoryItemResponseJsonFormat: Format[LocalInventoryItemResponse] = Json.format[LocalInventoryItemResponse]
}

