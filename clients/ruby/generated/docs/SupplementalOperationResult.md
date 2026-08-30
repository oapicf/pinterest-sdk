# PinterestSdkClient::SupplementalOperationResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **errors** | [**Array&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] |
| **item_id** | **String** | Catalog item id in the merchant namespace |  |
| **status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record |  |
| **store_code** | **String** | Store code for the local inventory item |  |
| **supplemental_type** | **String** |  |  |
| **warnings** | [**Array&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SupplementalOperationResult.new(
  errors: null,
  item_id: item_id_1,
  status: null,
  store_code: store_1,
  supplemental_type: null,
  warnings: null
)
```

