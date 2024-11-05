package org.openapitools.server.model


/**
 * @param partnerId Unique identifier of a business partner to update asset access to. for example: ''1234567890123''
 * @param assetId Unique identifier of the business asset. for example: ''549755885175''
 * @param permissions A non-empty array of permissions to assign to the partner. for example: ''["ANALYST","ADMIN"]''
*/
final case class UpdatePartnerAssetAccessBodyAccessesInner (
  partnerId: String,
  assetId: String,
  permissions: Seq[Permissions]
)

