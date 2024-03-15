# PinterestSdkClient::CatalogsFeedProcessingResult

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **created_at** | **Time** |  | [optional] |
| **id** | **String** |  | [optional] |
| **updated_at** | **Time** |  | [optional] |
| **ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  |
| **status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  |
| **product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  |
| **validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedProcessingResult.new(
  created_at: 2022-03-14T15:15:22Z,
  id: null,
  updated_at: 2022-03-14T15:16:34Z,
  ingestion_details: null,
  status: null,
  product_counts: null,
  validation_details: null
)
```

