# PinterestSdkClient::CatalogsReportFeedIngestionStats

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_type** | **String** |  | [optional] |
| **catalog_id** | **String** | ID of the catalog entity. | [optional] |
| **code** | **Integer** | The event code that a diagnostics aggregated number references | [optional] |
| **code_label** | **String** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] |
| **message** | **String** | Title message describing the diagnostic issue | [optional] |
| **occurrences** | **Integer** | Number of occurrences of the issue | [optional] |
| **severity** | **String** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CatalogsReportFeedIngestionStats.new(
  report_type: null,
  catalog_id: null,
  code: 112,
  code_label: AVAILABILITY_INVALID,
  message: null,
  occurrences: 10,
  severity: null
)
```

