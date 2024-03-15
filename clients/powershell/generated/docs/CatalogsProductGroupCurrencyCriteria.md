# CatalogsProductGroupCurrencyCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Values** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**Negated** | **Boolean** |  | [optional] [default to $false]

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupCurrencyCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupCurrencyCriteria  -Values null `
 -Negated null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupCurrencyCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

