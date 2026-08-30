package org.openapitools.server.model


/**
 * The terminated asset access.
 *
 * @param assetId Unique identifier of a business asset. for example: ''null''
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. for example: ''null''
 * @param isSharedPartner If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. for example: ''null''
 * @param partnerId Unique identifier of a business partner. for example: ''null''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class DeletePartnerAssetAccessResult (
  assetId: Option[String] = None,
  assetType: Option[String] = None,
  isSharedPartner: Option[Boolean] = None,
  partnerId: Option[String] = None,
  permissions: Option[Seq[String]] = None
)

