package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatePartnerAssetAccessBody_accesses_inner.
  * @param assetId Unique identifier of the business asset.
  * @param partnerId Unique identifier of a business partner to update asset access to.
  * @param permissions A non-empty array of permissions to assign to the partner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdatePartnerAssetAccessBodyAccessesInner(
  assetId: String,
  partnerId: String,
  permissions: List[Permissions]
)

object UpdatePartnerAssetAccessBodyAccessesInner {
  implicit lazy val updatePartnerAssetAccessBodyAccessesInnerJsonFormat: Format[UpdatePartnerAssetAccessBodyAccessesInner] = Json.format[UpdatePartnerAssetAccessBodyAccessesInner]
}

