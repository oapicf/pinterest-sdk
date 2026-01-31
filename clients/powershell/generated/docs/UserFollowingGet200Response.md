# UserFollowingGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**UserSummary[]**](UserSummary.md) | Users | 

## Examples

- Prepare the resource
```powershell
$UserFollowingGet200Response = Initialize-PSOpenAPIToolsUserFollowingGet200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$UserFollowingGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

