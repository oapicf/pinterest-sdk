package org.openapitools.server.model


/**
 * @param assetId Id of the asset on which to remove member permissions. for example: ''null''
 * @param memberId Unique identifier of the member on which to perform the asset permission removal for example: ''null''
*/
final case class DeleteMemberAssetAccessItem (
  assetId: String,
  memberId: String
)

