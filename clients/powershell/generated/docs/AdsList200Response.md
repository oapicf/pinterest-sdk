# AdsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**Ad[]**](Ad.md) |  | 

## Examples

- Prepare the resource
```powershell
$AdsList200Response = Initialize-PSOpenAPIToolsAdsList200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

