# BusinessMemberAssetsGetResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**AssetIdPermissions[]**](AssetIdPermissions.md) |  | 
**TotalDataCount** | **Int32** | Total number of assets matching the query | 
**TotalDataCountByStatus** | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) | [optional] 

## Examples

- Prepare the resource
```powershell
$BusinessMemberAssetsGetResponse = Initialize-PSOpenAPIToolsBusinessMemberAssetsGetResponse  -Bookmark null `
 -Items null `
 -TotalDataCount null `
 -TotalDataCountByStatus null
```

- Convert the resource to JSON
```powershell
$BusinessMemberAssetsGetResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

