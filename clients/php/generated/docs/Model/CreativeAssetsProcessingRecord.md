# # CreativeAssetsProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional]
**errors** | [**\OpenAPI\Client\Model\ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional]
**warnings** | [**\OpenAPI\Client\Model\ItemValidationEvent[]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional]
**status** | [**\OpenAPI\Client\Model\ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
