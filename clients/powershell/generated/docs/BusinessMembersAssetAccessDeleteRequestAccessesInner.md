# BusinessMembersAssetAccessDeleteRequestAccessesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Id of the asset on which to remove member permissions. | 
**MemberId** | **String** | Unique identifier of the member on which to perform the asset permission removal | 

## Examples

- Prepare the resource
```powershell
$BusinessMembersAssetAccessDeleteRequestAccessesInner = Initialize-PSOpenAPIToolsBusinessMembersAssetAccessDeleteRequestAccessesInner  -AssetId 549755885175 `
 -MemberId 140943737684417
```

- Convert the resource to JSON
```powershell
$BusinessMembersAssetAccessDeleteRequestAccessesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

