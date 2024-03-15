# FollowersList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UserSummary[]**](UserSummary.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$FollowersList200Response = Initialize-PSOpenAPIToolsFollowersList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$FollowersList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

