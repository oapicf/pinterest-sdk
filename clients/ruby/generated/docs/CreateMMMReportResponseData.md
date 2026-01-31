# PinterestSdkClient::CreateMMMReportResponseData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message** | **String** |  | [optional] |
| **report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] |
| **status** | **String** |  | [optional] |
| **token** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateMMMReportResponseData.new(
  message: null,
  report_status: null,
  status: success,
  token: null
)
```

