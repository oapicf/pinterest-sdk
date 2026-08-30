# BaseBusinessAssets

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | Option<[**models::AssetGroupBinding**](AssetGroupBinding.md)> | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. | [optional]
**asset_id** | Option<**String**> | Unique identifier of a business asset. | [optional]
**asset_type** | Option<[**models::AssetTypeResponse**](AssetTypeResponse.md)> |  | [optional]
**permissions** | Option<**Vec<String>**> | Permission levels the requesting business has on an asset. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


