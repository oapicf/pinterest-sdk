# Org.OpenAPITools.Model.AssetIdPermissions
An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **string** | Unique identifier of a business asset. | [optional] 
**AssetType** | **string** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**Permissions** | **List&lt;string&gt;** | Permission levels member or partner has on an asset. | [optional] 
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

