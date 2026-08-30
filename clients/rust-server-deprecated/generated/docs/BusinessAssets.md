# BusinessAssets

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [***models::AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. | [optional] [default to None]
**asset_id** | **String** | Unique identifier of a business asset. | [optional] [default to None]
**asset_type** | [***models::AssetTypeResponse**](AssetTypeResponse.md) |  | [optional] [default to None]
**permissions** | **Vec<String>** | Permission levels the requesting business has on an asset. | [optional] [default to None]
**catalog_info** | [***models::CatalogBinding**](CatalogBinding.md) | An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


