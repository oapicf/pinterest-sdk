package org.openapitools.server.model


/**
 * An object containing the permissions a business partner has on the asset.
 *
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. for example: ''AD_ACCOUNT''
 * @param partnerId Unique identifier of a business partner. for example: ''140943737684417''
 * @param permissions Permission levels member or partner has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class UpdatePartnerAssetsResult (
  assetId: Option[String] = None,
  assetType: Option[String] = None,
  partnerId: Option[String] = None,
  permissions: Option[Seq[String]] = None
)

