# Org.OpenAPITools.Model.BaseBusinessAssets
An object containing the permissions a business has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 
**AssetId** | **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | **AssetTypeResponse** |  | [optional] 
**Permissions** | **List&lt;string&gt;** | Permission levels the requesting business has on an asset. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

