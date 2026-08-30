# CatalogsProductGroupUint32Criteria
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Negated** | **Boolean** |  | [optional] 
**Operator** | [**NumericFilterOperatorType**](NumericFilterOperatorType.md) |  | 
**Value** | **Int32** |  | 

## Examples

- Prepare the resource
```powershell
$CatalogsProductGroupUint32Criteria = Initialize-PSOpenAPIToolsCatalogsProductGroupUint32Criteria  -Negated null `
 -Operator null `
 -Value null
```

- Convert the resource to JSON
```powershell
$CatalogsProductGroupUint32Criteria | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

