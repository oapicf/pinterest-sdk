package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatePartnerAssetAccessItem.
  * @param assetId Unique identifier of the business asset.
  * @param partnerId Unique identifier of a business partner to update asset access to.
  * @param permissions A non-empty array of permissions to assign to the partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdatePartnerAssetAccessItem(
  assetId: String,
  partnerId: String,
  permissions: List[Permissions]
)

object UpdatePartnerAssetAccessItem {
  implicit lazy val updatePartnerAssetAccessItemJsonFormat: Format[UpdatePartnerAssetAccessItem] = Json.format[UpdatePartnerAssetAccessItem]
}

