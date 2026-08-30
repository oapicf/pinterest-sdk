
# Table `BusinessAssets`
(mapped from: BusinessAssets)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetGroupInfo** | asset_group_info | long |  | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. |  [optional] [foreignkey]
**assetId** | asset_id | text |  | **kotlin.String** | Unique identifier of a business asset. |  [optional]
**assetType** | asset_type | long |  | [**AssetTypeResponse**](AssetTypeResponse.md) |  |  [optional] [foreignkey]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels the requesting business has on an asset. |  [optional]
**catalogInfo** | catalog_info | long |  | [**CatalogBinding**](CatalogBinding.md) | An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;. |  [optional] [foreignkey]





# **Table `BusinessAssetsPermissions`**
(mapped from: BusinessAssetsPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessAssets | businessAssets | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*




