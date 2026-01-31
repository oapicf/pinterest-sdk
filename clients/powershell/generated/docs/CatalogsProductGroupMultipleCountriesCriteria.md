# CatalogsProductGroupMultipleCountriesCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Negated** | **Boolean** |  | [optional] [default to $false]
**Values** | [**Country[]**](Country.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupMultipleCountriesCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupMultipleCountriesCriteria  -Negated null `
 -Values null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupMultipleCountriesCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

