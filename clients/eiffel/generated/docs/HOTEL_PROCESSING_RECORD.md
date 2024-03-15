# HOTEL_PROCESSING_RECORD

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotel_id** | [**STRING_32**](STRING_32.md) | The catalog hotel id in the merchant namespace | [optional] [default to null]
**errors** | [**LIST [ITEM_VALIDATION_EVENT]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to null]
**warnings** | [**LIST [ITEM_VALIDATION_EVENT]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to null]
**status** | [**ITEM_PROCESSING_STATUS**](ItemProcessingStatus.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


