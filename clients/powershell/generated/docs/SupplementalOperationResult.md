# SupplementalOperationResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**SupplementalItemValidationEvent[]**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**ItemId** | **String** | Catalog item id in the merchant namespace | 
**Status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**StoreCode** | **String** | Store code for the local inventory item | 
**SupplementalType** | **String** |  | 
**Warnings** | [**SupplementalItemValidationEvent[]**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

## Examples

- Prepare the resource
```powershell
$SupplementalOperationResult = Initialize-PSOpenAPIToolsSupplementalOperationResult  -Errors null `
 -ItemId item_id_1 `
 -Status null `
 -StoreCode store_1 `
 -SupplementalType null `
 -Warnings null
```

- Convert the resource to JSON
```powershell
$SupplementalOperationResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

