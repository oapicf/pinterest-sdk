# ItemProcessingRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**Warnings** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**Status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ItemProcessingRecord = Initialize-PSOpenAPIToolsItemProcessingRecord  -ItemId DS0294-M `
 -Errors null `
 -Warnings null `
 -Status null
```

- Convert the resource to JSON
```powershell
$ItemProcessingRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

