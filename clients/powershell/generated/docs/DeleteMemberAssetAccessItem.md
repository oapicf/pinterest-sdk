# DeleteMemberAssetAccessItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Id of the asset on which to remove member permissions. | 
**MemberId** | **String** | Unique identifier of the member on which to perform the asset permission removal | 

## Examples

- Prepare the resource
```powershell
$DeleteMemberAssetAccessItem = Initialize-PSOpenAPIToolsDeleteMemberAssetAccessItem  -AssetId null `
 -MemberId null
```

- Convert the resource to JSON
```powershell
$DeleteMemberAssetAccessItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

