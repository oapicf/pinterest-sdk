# UserAccountFollowedInterests200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Interest[]**](Interest.md) |  | 

## Examples

- Prepare the resource
```powershell
$UserAccountFollowedInterests200Response = Initialize-PSOpenAPIToolsUserAccountFollowedInterests200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$UserAccountFollowedInterests200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

