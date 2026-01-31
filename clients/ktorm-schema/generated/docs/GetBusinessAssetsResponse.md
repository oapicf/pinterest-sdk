
# Table `GetBusinessAssetsResponse`
(mapped from: GetBusinessAssetsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupInfo** | asset_group_info | long |  | [**AssetGroupBinding**](AssetGroupBinding.md) |  |  [optional] [foreignkey]
**assetId** | asset_id | text |  | **kotlin.String** | Unique identifier of a business asset. |  [optional]
**assetType** | asset_type | text |  | **kotlin.String** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. |  [optional]
**catalogInfo** | catalog_info | long |  | [**GetBusinessAssetsResponseCatalogInfo**](GetBusinessAssetsResponseCatalogInfo.md) |  |  [optional] [foreignkey]






