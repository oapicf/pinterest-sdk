package model

import play.api.libs.json._

/**
  * Product metadata entity
  * @param itemId The user-created unique ID that represents the product.
  * @param itemGroupId The parent ID of the product.
  * @param price The price of the product.
  * @param salePrice The discounted price of the product.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductMetadata(
  itemId: String,
  itemGroupId: String,
  availability: NonNullableProductAvailabilityType,
  price: BigDecimal,
  salePrice: BigDecimal,
  currency: NonNullableCatalogsCurrency
)

object CatalogsProductMetadata {
  implicit lazy val catalogsProductMetadataJsonFormat: Format[CatalogsProductMetadata] = Json.format[CatalogsProductMetadata]
}

