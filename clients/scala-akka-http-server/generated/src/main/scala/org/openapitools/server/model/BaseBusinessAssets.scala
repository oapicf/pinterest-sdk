package org.openapitools.server.model


/**
 * An object containing the permissions a business has on the asset.
 *
 * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. for example: ''null''
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param assetType  for example: ''null''
 * @param permissions Permission levels the requesting business has on an asset. for example: ''["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"]''
*/
final case class BaseBusinessAssets (
  assetGroupInfo: Option[AssetGroupBinding] = None,
  assetId: Option[String] = None,
  assetType: Option[AssetTypeResponse] = None,
  permissions: Option[Seq[String]] = None
)

