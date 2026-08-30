package model

import play.api.libs.json._

/**
  * Retail product metadata entity
  * @param itemGroupId The parent ID of the product.
  * @param itemId The user-created unique ID that represents the product.
  * @param price The price of the product.
  * @param salePrice The discounted price of the product.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailProductMetadata(
  availability: ProductAvailability,
  currency: NonNullableCatalogsCurrency,
  itemGroupId: String,
  itemId: String,
  price: BigDecimal,
  salePrice: BigDecimal
)

object CatalogsRetailProductMetadata {
  implicit lazy val catalogsRetailProductMetadataJsonFormat: Format[CatalogsRetailProductMetadata] = Json.format[CatalogsRetailProductMetadata]
}

