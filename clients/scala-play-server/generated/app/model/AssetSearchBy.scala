package model

import play.api.libs.json._

/**
  * The field to search member assets by
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssetSearchBy(
)

object AssetSearchBy {
  implicit lazy val assetSearchByJsonFormat: Format[AssetSearchBy] = Json.format[AssetSearchBy]
}

