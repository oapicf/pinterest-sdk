package org.openapitools.server.model


/**
 * Local inventory attributes for retail items (all fields optional for update/get)
 *
 * @param adLink Ad link for the item for example: ''https://examplelink.com''
 * @param availability Availability status of the item for example: ''in stock''
 * @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. for example: ''49.99 USD''
 * @param salePrice The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. for example: ''24.99 USD''
*/
final case class RetailLocalInventoryItemAttributesOptional (
  adLink: Option[String] = None,
  availability: Option[ItemAvailability] = None,
  price: Option[String] = None,
  salePrice: Option[String] = None
)

