package model

import play.api.libs.json._

/**
  * The field to search member assets by
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetSearchBy(
)

object AssetSearchBy {
  implicit lazy val assetSearchByJsonFormat: Format[AssetSearchBy] = Json.format[AssetSearchBy]
}

