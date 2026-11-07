package model

import play.api.libs.json._

/**
  * An object containing the permissions a business partner has on the asset.
  * @param assetId Unique identifier of a business asset.
  * @param partnerId Unique identifier of a business partner.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdatePartnerAssetsResult(
  assetId: Option[String],
  assetType: Option[AssetTypeResponse],
  partnerId: Option[String],
  permissions: Option[List[String]]
)

object UpdatePartnerAssetsResult {
  implicit lazy val updatePartnerAssetsResultJsonFormat: Format[UpdatePartnerAssetsResult] = Json.format[UpdatePartnerAssetsResult]
}

