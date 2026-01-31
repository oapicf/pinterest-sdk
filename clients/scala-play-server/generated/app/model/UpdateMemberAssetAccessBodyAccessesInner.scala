package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateMemberAssetAccessBody_accesses_inner.
  * @param assetId Id of the asset to update.
  * @param memberId Unique identifier of the member on which to perform the update
  * @param permissions A non-empty array of permissions to assign to the member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateMemberAssetAccessBodyAccessesInner(
  assetId: String,
  memberId: String,
  permissions: List[Permissions]
)

object UpdateMemberAssetAccessBodyAccessesInner {
  implicit lazy val updateMemberAssetAccessBodyAccessesInnerJsonFormat: Format[UpdateMemberAssetAccessBodyAccessesInner] = Json.format[UpdateMemberAssetAccessBodyAccessesInner]
}

