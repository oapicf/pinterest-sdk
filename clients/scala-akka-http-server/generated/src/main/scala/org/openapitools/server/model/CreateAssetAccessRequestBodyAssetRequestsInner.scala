package org.openapitools.server.model


/**
 * @param partnerId Unique identifier of a business partner to request asset access to. for example: ''809944451643622187''
 * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  for example: ''{"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]}''
*/
final case class CreateAssetAccessRequestBodyAssetRequestsInner (
  partnerId: String,
  assetIdToPermissions: Map[String, Seq[Permissions]]
)

