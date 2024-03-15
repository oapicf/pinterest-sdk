# AdsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**AdResponse[]**](AdResponse.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsList200Response = Initialize-PSOpenAPIToolsAdsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$AdsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

