# openapi::CreativeAssetsProcessingRecord

Object describing an item processing record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | **character** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**warnings** | [**array[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] [Enum: ] 


