package model

import play.api.libs.json._

/**
  * Retail product metadata entity
  * @param itemId The user-created unique ID that represents the product.
  * @param itemGroupId The parent ID of the product.
  * @param price The price of the product.
  * @param salePrice The discounted price of the product.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsRetailProductMetadata(
  itemId: String,
  itemGroupId: String,
  availability: NonNullableProductAvailabilityType,
  price: BigDecimal,
  salePrice: BigDecimal,
  currency: NonNullableCatalogsCurrency
)

object CatalogsRetailProductMetadata {
  implicit lazy val catalogsRetailProductMetadataJsonFormat: Format[CatalogsRetailProductMetadata] = Json.format[CatalogsRetailProductMetadata]
}

