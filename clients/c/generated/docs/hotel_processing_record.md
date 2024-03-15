# hotel_processing_record_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotel_id** | **char \*** | The catalog hotel id in the merchant namespace | [optional] 
**errors** | [**list_t**](item_validation_event.md) \* | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**warnings** | [**list_t**](item_validation_event.md) \* | Array with the validation warnings for the item processing record | [optional] 
**status** | **item_processing_status_t \*** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


