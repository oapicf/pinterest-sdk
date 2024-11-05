# PinterestSdkClient::CatalogsReportFeedIngestionFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_type** | **String** |  |  |
| **feed_id** | **String** | ID of the feed entity. |  |
| **processing_result_id** | **String** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsReportFeedIngestionFilter.new(
  report_type: null,
  feed_id: null,
  processing_result_id: null
)
```

