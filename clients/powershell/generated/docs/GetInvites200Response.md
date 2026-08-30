# GetInvites200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**InviteResponse[]**](InviteResponse.md) |  | 

## Examples

- Prepare the resource
```powershell
$GetInvites200Response = Initialize-PSOpenAPIToolsGetInvites200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$GetInvites200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

