package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteMemberAssetAccessItem.
  * @param assetId Id of the asset on which to remove member permissions.
  * @param memberId Unique identifier of the member on which to perform the asset permission removal
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeleteMemberAssetAccessItem(
  assetId: String,
  memberId: String
)

object DeleteMemberAssetAccessItem {
  implicit lazy val deleteMemberAssetAccessItemJsonFormat: Format[DeleteMemberAssetAccessItem] = Json.format[DeleteMemberAssetAccessItem]
}

