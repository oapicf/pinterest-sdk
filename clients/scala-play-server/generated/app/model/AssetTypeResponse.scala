package model

import play.api.libs.json._

/**
  * Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AssetTypeResponse(
)

object AssetTypeResponse {
  implicit lazy val assetTypeResponseJsonFormat: Format[AssetTypeResponse] = Json.format[AssetTypeResponse]
}

