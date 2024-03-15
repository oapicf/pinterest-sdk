# PinterestSdkClient::IntegrationLogClientError

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **cause** | **String** | Original cause of the error. | [optional] |
| **column_number** | **Integer** | Column number in the line of the file that raised the error. | [optional] |
| **file_name** | **String** | Filename where the error happened. | [optional] |
| **line_number** | **Integer** | Line number where the error happened. | [optional] |
| **message** | **String** | Human-readable description of the error. | [optional] |
| **message_detail** | **String** | More detail about the message. | [optional] |
| **name** | **String** | Filename where the error happened. | [optional] |
| **number** | **Integer** | Integer that specifies the error code. | [optional] |
| **stack_trace** | **String** | Stack trace of where the error happened. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationLogClientError.new(
  cause: null,
  column_number: null,
  file_name: null,
  line_number: null,
  message: null,
  message_detail: null,
  name: null,
  number: null,
  stack_trace: null
)
```

