# LocalInventoryOperationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**OpenAPI\Server\Model\SupplementalItemValidationEvent**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**itemId** | **string** | Catalog item id in the merchant namespace | 
**status** | [**OpenAPI\Server\Model\SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**storeCode** | **string** | Store code for the local inventory item | 
**supplementalType** | **string** |  | 
**warnings** | [**OpenAPI\Server\Model\SupplementalItemValidationEvent**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


