package org.openapitools.server.model


/**
 * The terminated asset access.
 *
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. for example: ''AD_ACCOUNT''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
 * @param isSharedPartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. for example: ''false''
 * @param partnerId Unique identifier of a business partner. for example: ''140943737684417''
*/
final case class DeletePartnerAssetsResult (
  assetId: Option[String] = None,
  assetType: Option[String] = None,
  permissions: Option[Seq[String]] = None,
  isSharedPartner: Option[Boolean] = None,
  partnerId: Option[String] = None
)

