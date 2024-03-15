# PinterestSdkClient::CustomerListUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **records** | **String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. |  |
| **operation_type** | [**UserListOperationType**](UserListOperationType.md) |  |  |
| **exceptions** | [**Exception**](.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerListUpdateRequest.new(
  records: email2@pinterest.com,email6@pinterest.com,,
  operation_type: null,
  exceptions: null
)
```

