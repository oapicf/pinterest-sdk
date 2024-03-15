

# ItemProcessingRecord

Object describing an item processing record

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**itemId** | **String** | The catalog item id in the merchant namespace |  [optional] |
|**errors** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional] |
|**warnings** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional] |
|**status** | **ItemProcessingStatus** |  |  [optional] |



