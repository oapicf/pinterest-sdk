# AdAccountsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**AdAccount[]**](AdAccount.md) |  | 

## Examples

- Prepare the resource
```powershell
$AdAccountsList200Response = Initialize-PSOpenAPIToolsAdAccountsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdAccountsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

