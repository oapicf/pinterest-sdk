package org.openapitools.server.model


/**
 * @param assetId Unique identifier of the business asset. for example: ''null''
 * @param partnerId Unique identifier of a business partner to update asset access to. for example: ''null''
 * @param permissions A non-empty array of permissions to assign to the partner. for example: ''null''
*/
final case class UpdatePartnerAssetAccessItem (
  assetId: String,
  partnerId: String,
  permissions: Seq[Permissions]
)

