# PromotionTemplateValue
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Amount** | **Decimal** | Numeric value. | [optional] 
**CurrencyCode** | [**Currency**](Currency.md) |  | [optional] 
**CustomText** | **String** | Custom text. | [optional] 
**Percent** | **Decimal** | Percent value. | [optional] 

## Examples

- Prepare the resource
```powershell
$PromotionTemplateValue = Initialize-PSOpenAPIToolsPromotionTemplateValue  -Amount 100 `
 -CurrencyCode null `
 -CustomText My promotion `
 -Percent 10
```

- Convert the resource to JSON
```powershell
$PromotionTemplateValue | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

