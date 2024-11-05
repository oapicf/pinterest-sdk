# CreativeAssetsProcessingRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeAssetsId** | **String** | The catalog creative assets id in the merchant namespace | [optional] 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**Warnings** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**Status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CreativeAssetsProcessingRecord = Initialize-PSOpenAPIToolsCreativeAssetsProcessingRecord  -CreativeAssetsId DS0294-M `
 -Errors null `
 -Warnings null `
 -Status null
```

- Convert the resource to JSON
```powershell
$CreativeAssetsProcessingRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

