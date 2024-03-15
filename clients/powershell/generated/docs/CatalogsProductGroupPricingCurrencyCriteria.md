# CatalogsProductGroupPricingCurrencyCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operator** | **String** |  | 
**Value** | **Decimal** |  | 
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**Negated** | **Boolean** |  | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupPricingCurrencyCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupPricingCurrencyCriteria  -Operator null `
 -Value null `
 -Currency null `
 -Negated null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupPricingCurrencyCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

