package org.openapitools.server.model


/**
 * @param assetId Id of the asset to update. for example: ''549755885175''
 * @param memberId Unique identifier of the member on which to perform the update for example: ''140943737684417''
 * @param permissions A non-empty array of permissions to assign to the member. for example: ''["ANALYST","ADMIN"]''
*/
final case class UpdateMemberAssetAccessBodyAccessesInner (
  assetId: String,
  memberId: String,
  permissions: Seq[Permissions]
)

