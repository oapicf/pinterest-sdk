# PinterestSdkClient::CatalogsFeedProcessingResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  | [readonly] |
| **id** | **String** | ID of the feed processing result. |  |
| **ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  |
| **product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  |
| **status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  |
| **updated_at** | **Time** |  | [readonly] |
| **validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  |
| **video_counts** | [**CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedProcessingResult.new(
  created_at: 2022-03-14T15:15:22Z,
  id: 864344156814050986,
  ingestion_details: null,
  product_counts: null,
  status: null,
  updated_at: 2022-03-14T15:16:34Z,
  validation_details: null,
  video_counts: null
)
```

