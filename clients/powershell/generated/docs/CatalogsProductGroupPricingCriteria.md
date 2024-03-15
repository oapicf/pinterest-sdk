# CatalogsProductGroupPricingCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Inclusion** | **Boolean** |  | [optional] [default to $true]
**Values** | **Decimal** |  | 
**Negated** | **Boolean** |  | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupPricingCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupPricingCriteria  -Inclusion null `
 -Values null `
 -Negated null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupPricingCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

