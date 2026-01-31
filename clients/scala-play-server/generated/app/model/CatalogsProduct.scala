package model

import play.api.libs.json._

/**
  * Catalogs product for all verticals
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProduct(
  catalogType: CatalogsType,
  metadata: CatalogsCreativeAssetsProductMetadata,
  pin: Pin
)

object CatalogsProduct {
  implicit lazy val catalogsProductJsonFormat: Format[CatalogsProduct] = Json.format[CatalogsProduct]
}

