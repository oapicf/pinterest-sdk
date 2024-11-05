# PinterestSdkClient::CatalogsFeedIngestion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** |  |  |
| **feed_id** | **String** |  |  |
| **created_at** | **Time** |  |  |
| **status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedIngestion.new(
  id: 01234,
  feed_id: 56789,
  created_at: 2022-03-14T15:16:34Z,
  status: null
)
```

