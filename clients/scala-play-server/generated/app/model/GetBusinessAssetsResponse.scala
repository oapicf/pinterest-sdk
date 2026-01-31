package model

import play.api.libs.json._

/**
  * An object containing the permissions a business has on the asset.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetBusinessAssetsResponse(
  assetId: Option[String],
  assetType: Option[String],
  assetGroupInfo: Option[AssetGroupBinding]
)

object GetBusinessAssetsResponse {
  implicit lazy val getBusinessAssetsResponseJsonFormat: Format[GetBusinessAssetsResponse] = Json.format[GetBusinessAssetsResponse]
}

