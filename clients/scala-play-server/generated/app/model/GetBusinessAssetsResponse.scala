package model

import play.api.libs.json._

/**
  * An object containing the permissions a business has on the asset.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetBusinessAssetsResponse(
  assetGroupInfo: Option[AssetGroupBinding],
  assetId: Option[String],
  assetType: Option[String],
  catalogInfo: Option[GetBusinessAssetsResponseCatalogInfo]
)

object GetBusinessAssetsResponse {
  implicit lazy val getBusinessAssetsResponseJsonFormat: Format[GetBusinessAssetsResponse] = Json.format[GetBusinessAssetsResponse]
}

