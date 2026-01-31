# PinterestSdkClient::ItemProcessingRecord

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] |
| **item_id** | **String** | The catalog item id in the merchant namespace | [optional] |
| **status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] |
| **warnings** | [**Array&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ItemProcessingRecord.new(
  errors: null,
  item_id: DS0294-M,
  status: null,
  warnings: null
)
```

