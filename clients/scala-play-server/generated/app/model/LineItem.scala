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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

