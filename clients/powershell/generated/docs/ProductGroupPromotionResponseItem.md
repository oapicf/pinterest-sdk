# ProductGroupPromotionResponseItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**ProductGroupPromotionResponseElement**](ProductGroupPromotionResponseElement.md) |  | [optional] 
**Exceptions** | [**Exception[]**](Exception.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotionResponseItem = Initialize-PSOpenAPIToolsProductGroupPromotionResponseItem  -VarData null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotionResponseItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

