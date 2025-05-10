package model

import play.api.libs.json._

/**
  * Catalogs product for all verticals
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsProduct(
  catalogType: CatalogsType,
  metadata: CatalogsCreativeAssetsProductMetadata,
  pin: Pin
)

object CatalogsProduct {
  implicit lazy val catalogsProductJsonFormat: Format[CatalogsProduct] = Json.format[CatalogsProduct]
}

