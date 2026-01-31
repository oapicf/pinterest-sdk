# openapi::ItemProcessingRecord

Object describing an item processing record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**item_id** | **character** | The catalog item id in the merchant namespace | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] [Enum: ] 
**warnings** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 


