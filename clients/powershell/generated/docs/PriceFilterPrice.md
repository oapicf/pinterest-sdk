# PriceFilterPrice
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**Negated** | **Boolean** |  | [optional] 
**Operator** | [**NumericFilterOperatorType**](NumericFilterOperatorType.md) |  | 
**Value** | **Decimal** |  | 

## Examples

- Prepare the resource
```powershell
$PriceFilterPrice = Initialize-PSOpenAPIToolsPriceFilterPrice  -Currency null `
 -Negated null `
 -Operator null `
 -Value null
```

- Convert the resource to JSON
```powershell
$PriceFilterPrice | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

