package org.openapitools.server.model


/**
 * An object containing the permissions a business has on the asset.
 *
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. for example: ''AD_ACCOUNT''
 * @param assetGroupInfo  for example: ''null''
*/
final case class GetBusinessAssetsResponse (
  assetId: Option[String] = None,
  assetType: Option[String] = None,
  assetGroupInfo: Option[AssetGroupBinding] = None
)

