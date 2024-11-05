
# ItemProcessingRecord

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **itemId** | **kotlin.String** | The catalog item id in the merchant namespace |  [optional] |
| **errors** | [**kotlin.collections.List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional] |
| **warnings** | [**kotlin.collections.List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional] |
| **status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  |  [optional] |



