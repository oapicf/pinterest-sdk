# CatalogsProductGroupMultipleGenderCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Negated** | **Boolean** |  | [optional] [default to $false]
**Values** | [**Gender[]**](Gender.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupMultipleGenderCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupMultipleGenderCriteria  -Negated null `
 -Values null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupMultipleGenderCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

