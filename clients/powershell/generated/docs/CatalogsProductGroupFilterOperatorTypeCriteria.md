# CatalogsProductGroupFilterOperatorTypeCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FilterOperatorType** | **String** |  | [optional] [default to "IS"]
**Negated** | **Boolean** |  | [optional] [default to $false]
**Values** | **String[]** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupFilterOperatorTypeCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupFilterOperatorTypeCriteria  -FilterOperatorType null `
 -Negated null `
 -Values null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupFilterOperatorTypeCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

