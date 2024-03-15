# PinterestSdkClient::GetMMMReportResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **Float** |  | [optional] |
| **data** | [**GetMMMReportResponseData**](GetMMMReportResponseData.md) |  | [optional] |
| **message** | **String** |  | [optional] |
| **status** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::GetMMMReportResponse.new(
  code: 0,
  data: null,
  message: ok,
  status: success
)
```

