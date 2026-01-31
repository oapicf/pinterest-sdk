package org.openapitools.server.model


/**
 * An object containing the permissions a business has on the asset.
 *
 * @param assetGroupInfo  for example: ''null''
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. for example: ''AD_ACCOUNT''
 * @param catalogInfo  for example: ''null''
*/
final case class GetBusinessAssetsResponse (
  assetGroupInfo: Option[AssetGroupBinding] = None,
  assetId: Option[String] = None,
  assetType: Option[String] = None,
  catalogInfo: Option[GetBusinessAssetsResponseCatalogInfo] = None
)

