package org.openapitools.server.model


/**
 * @param assetGroupInfo An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. for example: ''null''
 * @param assetId Unique identifier of a business asset. for example: ''549755885175''
 * @param assetType  for example: ''null''
 * @param permissions Permission levels the requesting business has on an asset. for example: ''[FINANCE_MANAGER, CATALOGS_MANAGER, AUDIENCE_MANAGER]''
 * @param catalogInfo An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'. for example: ''null''
*/
final case class BusinessAssets (
  assetGroupInfo: Option[AssetGroupBinding] = None,
  assetId: Option[String] = None,
  assetType: Option[AssetTypeResponse] = None,
  permissions: Option[Seq[String]] = None,
  catalogInfo: Option[CatalogBinding] = None
)

