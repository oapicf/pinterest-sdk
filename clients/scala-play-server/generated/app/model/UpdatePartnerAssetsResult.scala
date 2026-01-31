package model

import play.api.libs.json._

/**
  * An object containing the permissions a business partner has on the asset.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  * @param partnerId Unique identifier of a business partner.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdatePartnerAssetsResult(
  assetId: Option[String],
  assetType: Option[String],
  partnerId: Option[String],
  permissions: Option[List[String]]
)

object UpdatePartnerAssetsResult {
  implicit lazy val updatePartnerAssetsResultJsonFormat: Format[UpdatePartnerAssetsResult] = Json.format[UpdatePartnerAssetsResult]
}

