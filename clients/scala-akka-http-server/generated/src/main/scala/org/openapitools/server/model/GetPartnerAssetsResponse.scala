package org.openapitools.server.model


/**
 * An object containing the permissions a you/your business partner has on the asset.
 *
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. for example: ''AD_ACCOUNT''
 * @param permissions The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
 * @param assetGroupInfo  for example: ''null''
*/
final case class GetPartnerAssetsResponse (
  assetId: Option[String] = None,
  assetType: Option[String] = None,
  permissions: Option[Seq[String]] = None,
  assetGroupInfo: Option[AssetGroupBinding] = None
)

