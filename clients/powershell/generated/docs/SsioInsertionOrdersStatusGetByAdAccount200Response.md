# SsioInsertionOrdersStatusGetByAdAccount200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bookmark** | **String** |  | [optional] 
**Items** | [**SSIOInsertionOrderStatus[]**](SSIOInsertionOrderStatus.md) |  | 

## Examples

- Prepare the resource
```powershell
$SsioInsertionOrdersStatusGetByAdAccount200Response = Initialize-PSOpenAPIToolsSsioInsertionOrdersStatusGetByAdAccount200Response  -Bookmark null `
 -Items null
```

- Convert the resource to JSON
```powershell
$SsioInsertionOrdersStatusGetByAdAccount200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

