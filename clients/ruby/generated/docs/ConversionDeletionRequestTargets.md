# PinterestSdkClient::ConversionDeletionRequestTargets

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **user_emails** | **Array&lt;String&gt;** | Array of plain text user emails. |  |
| **epiks** | **Array&lt;String&gt;** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionDeletionRequestTargets.new(
  user_emails: null,
  epiks: null
)
```

