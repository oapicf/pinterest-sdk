# PinterestRestApi.ItemProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** | The catalog item id in the merchant namespace | [optional] 
**errors** | [**[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**warnings** | [**[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 


