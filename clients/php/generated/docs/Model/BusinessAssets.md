# BusinessAssets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**\OpenAPI\Client\Model\AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional]
**asset_id** | **string** | Unique identifier of a business asset. | [optional]
**asset_type** | [**\OpenAPI\Client\Model\AssetTypeResponse**](AssetTypeResponse.md) |  | [optional]
**permissions** | **string[]** | Permission levels the requesting business has on an asset. | [optional]
**catalog_info** | [**\OpenAPI\Client\Model\CatalogBinding**](CatalogBinding.md) | An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
