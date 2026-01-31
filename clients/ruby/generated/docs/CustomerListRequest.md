# PinterestSdkClient::CustomerListRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **list_type** | [**UserListType**](UserListType.md) |  | [optional][default to &#39;EMAIL&#39;] |
| **name** | **String** | Customer list name. |  |
| **records** | **String** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CustomerListRequest.new(
  list_type: null,
  name: The Glengarry Glen Ross leads,
  records: email1@pinterest.com,email2@pinterest.com,..&lt;more records&gt;
)
```

