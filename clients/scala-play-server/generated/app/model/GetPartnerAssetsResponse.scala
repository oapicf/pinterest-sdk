package model

import play.api.libs.json._

/**
  * An object containing the permissions a you/your business partner has on the asset.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  * @param permissions The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class GetPartnerAssetsResponse(
  assetId: Option[String],
  assetType: Option[String],
  permissions: Option[List[String]],
  assetGroupInfo: Option[AssetGroupBinding]
)

object GetPartnerAssetsResponse {
  implicit lazy val getPartnerAssetsResponseJsonFormat: Format[GetPartnerAssetsResponse] = Json.format[GetPartnerAssetsResponse]
}

