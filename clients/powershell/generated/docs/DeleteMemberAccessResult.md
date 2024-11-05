# DeleteMemberAccessResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetId** | **String** | Unique identifier of the business asset. | [optional] 
**MemberId** | **String** | Unique identifier of the business member. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeleteMemberAccessResult = Initialize-PSOpenAPIToolsDeleteMemberAccessResult  -AssetId 549755885175 `
 -MemberId 140943737684417
```

- Convert the resource to JSON
```powershell
$DeleteMemberAccessResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

