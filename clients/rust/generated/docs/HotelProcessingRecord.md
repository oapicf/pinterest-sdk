# HotelProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotel_id** | Option<**String**> | The catalog hotel id in the merchant namespace | [optional]
**errors** | Option<[**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md)> | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional]
**warnings** | Option<[**Vec<models::ItemValidationEvent>**](ItemValidationEvent.md)> | Array with the validation warnings for the item processing record | [optional]
**status** | Option<[**models::ItemProcessingStatus**](ItemProcessingStatus.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


