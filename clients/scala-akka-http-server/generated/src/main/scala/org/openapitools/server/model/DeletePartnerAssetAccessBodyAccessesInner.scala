package org.openapitools.server.model


/**
 * @param assetId Unique identifier of the business asset. for example: ''549755885175''
 * @param partnerId Unique identifier of a business partner to update asset access to. for example: ''1234567890123''
 * @param partnerType If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset. for example: ''INTERNAL''
*/
final case class DeletePartnerAssetAccessBodyAccessesInner (
  assetId: String,
  partnerId: String,
  partnerType: Option[String] = None
)

