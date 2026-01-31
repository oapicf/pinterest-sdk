# GetBusinessAssetsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetGroupInfo** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 
**AssetId** | **String** | Unique identifier of a business asset. | [optional] 
**AssetType** | **String** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**CatalogInfo** | [**GetBusinessAssetsResponseCatalogInfo**](GetBusinessAssetsResponseCatalogInfo.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetBusinessAssetsResponse = Initialize-PSOpenAPIToolsGetBusinessAssetsResponse  -AssetGroupInfo null `
 -AssetId 549755885175 `
 -AssetType AD_ACCOUNT `
 -CatalogInfo null
```

- Convert the resource to JSON
```powershell
$GetBusinessAssetsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

