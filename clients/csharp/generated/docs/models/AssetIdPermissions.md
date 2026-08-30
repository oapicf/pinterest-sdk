# Org.OpenAPITools.Model.AssetIdPermissions
An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **string** | Unique identifier of a business asset. | 
**AssetType** | **AssetTypeResponse** |  | 
**Permissions** | **List&lt;string&gt;** | Permission levels member or partner has on an asset. | 
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) | An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

