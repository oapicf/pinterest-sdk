# PinterestSdkClient::CatalogsFeedIngestion

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** | Timestamp of the feed ingestion. |  |
| **feed_id** | **String** | Catalog Feed id pertaining to the feed ingestion. |  |
| **id** | **String** | Unique identifier of a feed ingestion. |  |
| **status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) | Status of the feed ingestion. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedIngestion.new(
  created_at: 2022-03-14T15:15:22Z,
  feed_id: 2680059592705,
  id: 2680059592705,
  status: null
)
```

