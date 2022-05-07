# ItemProcessingRecord

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **String** | The catalog item id in the merchant namespace | [optional] [default to None]
**errors** | [**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to None]
**warnings** | [**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to None]
**status** | [***models::ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


