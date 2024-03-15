# AdAccountsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**AdAccount[]**](AdAccount.md) | Ad accounts | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdAccountsList200Response = Initialize-PSOpenAPIToolsAdAccountsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$AdAccountsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

