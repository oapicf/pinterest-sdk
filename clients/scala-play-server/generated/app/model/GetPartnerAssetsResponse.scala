package model

import play.api.libs.json._

/**
  * An object containing the permissions a you/your business partner has on the asset.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  * @param permissions The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetPartnerAssetsResponse(
  assetGroupInfo: Option[AssetGroupBinding],
  assetId: Option[String],
  assetType: Option[String],
  permissions: Option[List[String]]
)

object GetPartnerAssetsResponse {
  implicit lazy val getPartnerAssetsResponseJsonFormat: Format[GetPartnerAssetsResponse] = Json.format[GetPartnerAssetsResponse]
}

