# PinterestSdkClient::MMMReport

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message** | **String** |  | [optional][readonly] |
| **report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional][readonly] |
| **size** | **Float** |  | [optional][readonly] |
| **status** | **String** |  | [optional][readonly] |
| **token** | **String** |  | [optional][readonly] |
| **url** | **String** |  | [optional][readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MMMReport.new(
  message: null,
  report_status: null,
  size: null,
  status: success,
  token: null,
  url: null
)
```

