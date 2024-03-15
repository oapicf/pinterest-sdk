# PinterestSdkClient::CatalogsFeedProductCounts

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **original** | **Integer** | The number of products in the feed file. | [optional] |
| **ingested** | **Integer** | The number of products successfully ingested from the feed file. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedProductCounts.new(
  original: null,
  ingested: null
)
```

