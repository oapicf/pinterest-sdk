# PinterestSdkClient::CreateMMMReportResponseData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] |
| **token** | **String** |  | [optional] |
| **message** | **String** |  | [optional] |
| **status** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateMMMReportResponseData.new(
  report_status: null,
  token: null,
  message: null,
  status: success
)
```

