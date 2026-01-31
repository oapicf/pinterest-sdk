# PinterestSdkClient::CatalogsFeedProcessingResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  |  |
| **id** | **String** |  |  |
| **updated_at** | **Time** |  |  |
| **ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  |
| **product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  |
| **status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  |
| **validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  |
| **video_counts** | [**CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedProcessingResult.new(
  created_at: 2022-03-14T15:15:22Z,
  id: null,
  updated_at: 2022-03-14T15:16:34Z,
  ingestion_details: null,
  product_counts: null,
  status: null,
  validation_details: null,
  video_counts: null
)
```

