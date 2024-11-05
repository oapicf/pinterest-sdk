# GetInvites200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**InviteResponse[]**](InviteResponse.md) | List of invite and request data. | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$GetInvites200Response = Initialize-PSOpenAPIToolsGetInvites200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$GetInvites200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

