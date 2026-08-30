package org.openapitools.server.model


/**
 * Local inventory item response
 *
 * @param adLink Ad link for the item for example: ''https://examplelink.com''
 * @param availability Availability status of the item for example: ''in stock''
 * @param createdAt The millisecond timestamp when the local inventory item was created for example: ''1641483432072''
 * @param itemId The catalog item id in the merchant namespace for example: ''DS0294-M''
 * @param lastUpdatedTime The millisecond timestamp when the local inventory item was lastly modified by the merchant. for example: ''1641483432072''
 * @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. for example: ''49.99 USD''
 * @param salePrice The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. for example: ''24.99 USD''
 * @param storeMetadata Store metadata for this local inventory item for example: ''null''
*/
final case class LocalInventoryItemResponse (
  adLink: Option[String] = None,
  availability: Option[ItemAvailability] = None,
  createdAt: Long,
  itemId: String,
  lastUpdatedTime: Long,
  price: Option[String] = None,
  salePrice: Option[String] = None,
  storeMetadata: StoreMetadata
)

