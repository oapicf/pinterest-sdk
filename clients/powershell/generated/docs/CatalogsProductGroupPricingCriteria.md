# CatalogsProductGroupPricingCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Inclusion** | **Boolean** |  | [optional] [default to $true]
**Negated** | **Boolean** |  | [optional] 
**Values** | **Decimal** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupPricingCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupPricingCriteria  -Inclusion null `
 -Negated null `
 -Values null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupPricingCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

