# SsioInsertionOrdersStatusGetByAdAccount200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**SSIOInsertionOrderStatus[]**](SSIOInsertionOrderStatus.md) | Insertion orders status by ad acount id | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$SsioInsertionOrdersStatusGetByAdAccount200Response = Initialize-PSOpenAPIToolsSsioInsertionOrdersStatusGetByAdAccount200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$SsioInsertionOrdersStatusGetByAdAccount200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

