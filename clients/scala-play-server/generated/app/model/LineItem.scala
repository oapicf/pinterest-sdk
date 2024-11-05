package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LineItem.
  * @param productBrand Product brand. For example, \"Parker\".
  * @param productCategory Product category. For example, \"Shoes\".
  * @param productId Product ID. For example, 1414.
  * @param productName Product name. For example, \"Parker Boots\".
  * @param productPrice Product price. For example, \"99.99\".
  * @param productQuantity Product quantity. For example, 2.
  * @param productVariant Product variant. For example, \"Red\".
  * @param productVariantId Product variant ID. For example, \"1414-34832\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LineItem(
  productBrand: Option[String],
  productCategory: Option[String],
  productId: Option[Int],
  productName: Option[String],
  productPrice: Option[String],
  productQuantity: Option[Int],
  productVariant: Option[String],
  productVariantId: Option[String]
)

object LineItem {
  implicit lazy val lineItemJsonFormat: Format[LineItem] = Json.format[LineItem]
}

