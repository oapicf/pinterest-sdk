# PinterestSdkClient::CatalogsFeedIngestion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  |  |
| **feed_id** | **String** |  |  |
| **id** | **String** |  |  |
| **status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedIngestion.new(
  created_at: 2022-03-14T15:16:34Z,
  feed_id: 56789,
  id: 01234,
  status: null
)
```

