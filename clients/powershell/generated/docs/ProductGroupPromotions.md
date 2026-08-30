# ProductGroupPromotions
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**ProductGroupPromotionResponseItem[]**](ProductGroupPromotionResponseItem.md) | Response-only: created or updated product group promotions, or exceptions. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotions = Initialize-PSOpenAPIToolsProductGroupPromotions  -Items null
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotions | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

