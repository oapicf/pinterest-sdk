package org.openapitools.server.model


/**
 * Object declaring an asset role update to an invite.
 *
 * @param inviteId Unique identifier of an invite. for example: ''1234567890123''
 * @param inviteType  for example: ''null''
 * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  for example: ''{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}''
*/
final case class CreateAssetInvitesRequestItem (
  inviteId: String,
  inviteType: InviteType,
  assetIdToPermissions: Map[String, Seq[Permissions]]
)

