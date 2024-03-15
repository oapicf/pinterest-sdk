# UserWebsitesGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**UserWebsiteSummary[]**](UserWebsiteSummary.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$UserWebsitesGet200Response = Initialize-PSOpenAPIToolsUserWebsitesGet200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$UserWebsitesGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

