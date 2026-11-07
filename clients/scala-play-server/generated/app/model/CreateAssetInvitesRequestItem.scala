package model

import play.api.libs.json._

/**
  * Object declaring an asset role update to an invite.
  * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
  * @param inviteId Unique identifier of an invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateAssetInvitesRequestItem(
  assetIdToPermissions: Map[String, List[Permissions]],
  inviteId: String,
  inviteType: InviteType
)

object CreateAssetInvitesRequestItem {
  implicit lazy val createAssetInvitesRequestItemJsonFormat: Format[CreateAssetInvitesRequestItem] = Json.format[CreateAssetInvitesRequestItem]
}

