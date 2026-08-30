package org.openapitools.server.model


/**
 * @param assetId Id of the asset to update. for example: ''null''
 * @param memberId Unique identifier of the member on which to perform the update for example: ''null''
 * @param permissions A non-empty array of permissions to assign to the member. for example: ''null''
*/
final case class UpdateMemberAssetAccessItem (
  assetId: String,
  memberId: String,
  permissions: Seq[Permissions]
)

