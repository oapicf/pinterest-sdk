# CatalogsProductGroupMultipleGenderCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Values** | [**Gender[]**](Gender.md) |  | 
**Negated** | **Boolean** |  | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupMultipleGenderCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupMultipleGenderCriteria  -Values null `
 -Negated null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupMultipleGenderCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

