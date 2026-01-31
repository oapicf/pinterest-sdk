# HotelProcessingRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**HotelId** | **String** | The catalog hotel id in the merchant namespace | [optional] 
**Status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 
**Warnings** | [**ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

## Examples

- Prepare the resource
```powershell
$HotelProcessingRecord = Initialize-PSOpenAPIToolsHotelProcessingRecord  -Errors null `
 -HotelId DS0294-M `
 -Status null `
 -Warnings null
```

- Convert the resource to JSON
```powershell
$HotelProcessingRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

