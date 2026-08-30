# SsioOrderLinesGetByAdAccount200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**SSIOOrderLine[]**](SSIOOrderLine.md) |  | 

## Examples

- Prepare the resource
```powershell
$SsioOrderLinesGetByAdAccount200Response = Initialize-PSOpenAPIToolsSsioOrderLinesGetByAdAccount200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$SsioOrderLinesGetByAdAccount200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

