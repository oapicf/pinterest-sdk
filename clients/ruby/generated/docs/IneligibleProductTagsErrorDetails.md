# PinterestSdkClient::IneligibleProductTagsErrorDetails

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_tags** | [**Array&lt;IneligibleProductTagErrorItem&gt;**](IneligibleProductTagErrorItem.md) | List of product tags that failed eligibility check. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IneligibleProductTagsErrorDetails.new(
  product_tags: null
)
```

