package org.openapitools.server.model


/**
 * @param assetId Id of the asset on which to remove member permissions. for example: ''549755885175''
 * @param memberId Unique identifier of the member on which to perform the asset permission removal for example: ''140943737684417''
*/
final case class BusinessMembersAssetAccessDeleteRequestAccessesInner (
  assetId: String,
  memberId: String
)

