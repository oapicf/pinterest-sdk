# PinterestSdkClient::ConversionProductReport

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message** | **String** | Message returned from the create report request | [optional][readonly] |
| **report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) | Async report status | [optional][readonly] |
| **size** | **Float** | Size of the report in bytes | [optional][readonly] |
| **token** | **String** | Token returned from the create report request | [optional][readonly] |
| **url** | **String** | URL of the report | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionProductReport.new(
  message: null,
  report_status: null,
  size: null,
  token: null,
  url: null
)
```

