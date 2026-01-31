
# HotelProcessingRecord

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **errors** | [**kotlin.collections.List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional] |
| **hotelId** | **kotlin.String** | The catalog hotel id in the merchant namespace |  [optional] |
| **status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  |  [optional] |
| **warnings** | [**kotlin.collections.List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional] |



