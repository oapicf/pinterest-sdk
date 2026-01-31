# SearchUserPinsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Pin[]**](Pin.md) |  | 

## Examples

- Prepare the resource
```powershell
$SearchUserPinsList200Response = Initialize-PSOpenAPIToolsSearchUserPinsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$SearchUserPinsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

