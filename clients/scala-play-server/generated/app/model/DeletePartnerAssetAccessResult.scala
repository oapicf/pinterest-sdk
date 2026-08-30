package model

import play.api.libs.json._

/**
  * The terminated asset access.
  * @param assetId Unique identifier of a business asset.
  * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG.
  * @param isSharedPartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset.
  * @param partnerId Unique identifier of a business partner.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DeletePartnerAssetAccessResult(
  assetId: Option[String],
  assetType: Option[String],
  isSharedPartner: Option[Boolean],
  partnerId: Option[String],
  permissions: Option[List[String]]
)

object DeletePartnerAssetAccessResult {
  implicit lazy val deletePartnerAssetAccessResultJsonFormat: Format[DeletePartnerAssetAccessResult] = Json.format[DeletePartnerAssetAccessResult]
}

