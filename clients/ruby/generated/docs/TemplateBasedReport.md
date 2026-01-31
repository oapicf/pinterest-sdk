# PinterestSdkClient::TemplateBasedReport

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message** | **String** |  | [optional] |
| **report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  |  |
| **template_id** | **String** | Unique identifier of a template. |  |
| **token** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateBasedReport.new(
  message: null,
  report_status: null,
  template_id: null,
  token: null
)
```

