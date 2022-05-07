# PinterestSdkClient::CatalogsFeedProcessingResultFields

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  |  |
| **status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  |  |
| **product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  |  |
| **validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsFeedProcessingResultFields.new(
  ingestion_details: null,
  status: null,
  product_counts: null,
  validation_details: null
)
```

