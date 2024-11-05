# GetBusinessAssetsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. | [optional] 
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessAssetsResponse = Initialize-PSOpenAPIToolsGetBusinessAssetsResponse  -AssetId 549755885175 `
 -AssetType AD_ACCOUNT `
 -AssetGroupInfo null
```

- Convert the resource to JSON
```powershell
$GetBusinessAssetsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

