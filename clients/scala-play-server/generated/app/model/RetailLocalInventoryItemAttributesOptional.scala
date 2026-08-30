package model

import play.api.libs.json._

/**
  * Local inventory attributes for retail items (all fields optional for update/get)
  * @param adLink Ad link for the item
  * @param availability Availability status of the item
  * @param price The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  * @param salePrice The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class RetailLocalInventoryItemAttributesOptional(
  adLink: Option[String],
  availability: Option[ItemAvailability],
  price: Option[String],
  salePrice: Option[String]
)

object RetailLocalInventoryItemAttributesOptional {
  implicit lazy val retailLocalInventoryItemAttributesOptionalJsonFormat: Format[RetailLocalInventoryItemAttributesOptional] = Json.format[RetailLocalInventoryItemAttributesOptional]
}

