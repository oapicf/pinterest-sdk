# PinterestSdkClient::ProductTagsBulkAddRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_tags** | [**Array&lt;ProductTagItem&gt;**](ProductTagItem.md) | List of product tags to add. Maximum 24 items allowed. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ProductTagsBulkAddRequest.new(
  product_tags: null
)
```

