# UserWebsitesGet200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**UserWebsite[]**](UserWebsite.md) |  | 

## Examples

- Prepare the resource
```powershell
$UserWebsitesGet200Response = Initialize-PSOpenAPIToolsUserWebsitesGet200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$UserWebsitesGet200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

