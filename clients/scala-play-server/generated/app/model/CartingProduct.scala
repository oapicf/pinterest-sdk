package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CartingProduct.
  * @param cartingProductId the internal Pinterest carting product id (different from industry product id)
  * @param displayPreferredRetailersOnly Whether to display only the preferred retailers for the carting product
  * @param displayProductPrice Whether to display the price for the carting product
  * @param preferredRetailers A sorted array of preferred retailers for the carting product
  * @param randomizePreferredRetailers Whether to randomize preferred retailers for the carting product
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CartingProduct(
  cartingProductId: String,
  displayPreferredRetailersOnly: Option[Boolean],
  displayProductPrice: Option[Boolean],
  preferredRetailers: Option[List[CartingRetailer]],
  randomizePreferredRetailers: Option[Boolean]
)

object CartingProduct {
  implicit lazy val cartingProductJsonFormat: Format[CartingProduct] = Json.format[CartingProduct]
}

