package model

import play.api.libs.json._

/**
  * The terminated asset access.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  * @param isSharedPartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
  * @param partnerId Unique identifier of a business partner.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeletePartnerAssetsResult(
  assetId: Option[String],
  assetType: Option[String],
  isSharedPartner: Option[Boolean],
  partnerId: Option[String],
  permissions: Option[List[String]]
)

object DeletePartnerAssetsResult {
  implicit lazy val deletePartnerAssetsResultJsonFormat: Format[DeletePartnerAssetsResult] = Json.format[DeletePartnerAssetsResult]
}

