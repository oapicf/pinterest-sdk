# PinterestSdkClient::CustomerListUploadCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **operation** | [**UserListOperationType**](UserListOperationType.md) |  |  |
| **total_parts** | **Integer** | Number of parts to upload the file in. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerListUploadCreateRequest.new(
  operation: null,
  total_parts: 2
)
```

