# ItemProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**\OpenAPI\Client\Model\ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional]
**item_id** | **string** | The catalog item id in the merchant namespace | [optional]
**status** | [**\OpenAPI\Client\Model\ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional]
**warnings** | [**\OpenAPI\Client\Model\ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
