# ItemProcessingRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **string** | The catalog item id in the merchant namespace | [optional] 
**errors** | [**OpenAPI\Server\Model\ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**warnings** | [**OpenAPI\Server\Model\ItemValidationEvent**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**status** | [**OpenAPI\Server\Model\ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


