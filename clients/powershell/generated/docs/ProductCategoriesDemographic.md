# ProductCategoriesDemographic
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Age** | **System.Collections.Hashtable** | Age demographic distribution | 
**Gender** | [**GenderDemographics**](GenderDemographics.md) |  | 

## Examples

- Prepare the resource
```powershell
$ProductCategoriesDemographic = Initialize-PSOpenAPIToolsProductCategoriesDemographic  -Age null `
 -Gender null
```

- Convert the resource to JSON
```powershell
$ProductCategoriesDemographic | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

