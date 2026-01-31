# CatalogsProductGroupPricingCurrencyCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**Negated** | **Boolean** |  | [optional] [default to $false]
**Operator** | **String** |  | 
**Value** | **Decimal** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupPricingCurrencyCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupPricingCurrencyCriteria  -Currency null `
 -Negated null `
 -Operator null `
 -Value null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupPricingCurrencyCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

