package model

import play.api.libs.json._

/**
  * Catalogs product for all verticals
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsProduct(
  catalogType: CatalogsType,
  metadata: CatalogsCreativeAssetsProductMetadata,
  pin: Pin
)

object CatalogsProduct {
  implicit lazy val catalogsProductJsonFormat: Format[CatalogsProduct] = Json.format[CatalogsProduct]
}

