# SsioOrderLinesGetByAdAccount200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**SSIOOrderLine[]**](SSIOOrderLine.md) | SSIO order lines by ad acount id | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SsioOrderLinesGetByAdAccount200Response = Initialize-PSOpenAPIToolsSsioOrderLinesGetByAdAccount200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$SsioOrderLinesGetByAdAccount200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

