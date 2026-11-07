package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateMemberAssetAccessItem.
  * @param assetId Id of the asset to update.
  * @param memberId Unique identifier of the member on which to perform the update
  * @param permissions A non-empty array of permissions to assign to the member.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdateMemberAssetAccessItem(
  assetId: String,
  memberId: String,
  permissions: List[Permissions]
)

object UpdateMemberAssetAccessItem {
  implicit lazy val updateMemberAssetAccessItemJsonFormat: Format[UpdateMemberAssetAccessItem] = Json.format[UpdateMemberAssetAccessItem]
}

