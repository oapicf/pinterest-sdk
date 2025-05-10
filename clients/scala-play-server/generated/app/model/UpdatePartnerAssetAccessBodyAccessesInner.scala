package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatePartnerAssetAccessBody_accesses_inner.
  * @param partnerId Unique identifier of a business partner to update asset access to.
  * @param assetId Unique identifier of the business asset.
  * @param permissions A non-empty array of permissions to assign to the partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdatePartnerAssetAccessBodyAccessesInner(
  partnerId: String,
  assetId: String,
  permissions: List[Permissions]
)

object UpdatePartnerAssetAccessBodyAccessesInner {
  implicit lazy val updatePartnerAssetAccessBodyAccessesInnerJsonFormat: Format[UpdatePartnerAssetAccessBodyAccessesInner] = Json.format[UpdatePartnerAssetAccessBodyAccessesInner]
}

