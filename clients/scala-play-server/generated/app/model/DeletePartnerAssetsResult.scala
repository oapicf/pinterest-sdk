package model

import play.api.libs.json._

/**
  * The terminated asset access.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
  * @param permissions Permission levels member or partner has on an asset.
  * @param isSharedPartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
  * @param partnerId Unique identifier of a business partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeletePartnerAssetsResult(
  assetId: Option[String],
  assetType: Option[String],
  permissions: Option[List[String]],
  isSharedPartner: Option[Boolean],
  partnerId: Option[String]
)

object DeletePartnerAssetsResult {
  implicit lazy val deletePartnerAssetsResultJsonFormat: Format[DeletePartnerAssetsResult] = Json.format[DeletePartnerAssetsResult]
}

