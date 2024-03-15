# CatalogsItemValidationDetails
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributeName** | [**NullableCatalogsItemFieldType**](NullableCatalogsItemFieldType.md) |  | 
**ProvidedValue** | **String** | Provided value that caused the validation issue. | 

## Examples

- Prepare the resource
```powershell
$CatalogsItemValidationDetails = Initialize-PSOpenAPIToolsCatalogsItemValidationDetails  -AttributeName null `
 -ProvidedValue null
```

- Convert the resource to JSON
```powershell
$CatalogsItemValidationDetails | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

