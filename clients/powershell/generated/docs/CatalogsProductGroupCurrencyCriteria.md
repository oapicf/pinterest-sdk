# CatalogsProductGroupCurrencyCriteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Negated** | **Boolean** |  | [optional] [default to $false]
**Values** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupCurrencyCriteria = Initialize-PSOpenAPIToolsCatalogsProductGroupCurrencyCriteria  -Negated null `
 -Values null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupCurrencyCriteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

