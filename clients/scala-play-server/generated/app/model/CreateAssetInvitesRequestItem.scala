package model

import play.api.libs.json._

/**
  * Object declaring an asset role update to an invite.
  * @param inviteId Unique identifier of an invite.
  * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateAssetInvitesRequestItem(
  inviteId: String,
  inviteType: InviteType,
  assetIdToPermissions: Map[String, List[Permissions]],
)

object CreateAssetInvitesRequestItem {
  implicit lazy val createAssetInvitesRequestItemJsonFormat: Format[CreateAssetInvitesRequestItem] = Json.format[CreateAssetInvitesRequestItem]
}

