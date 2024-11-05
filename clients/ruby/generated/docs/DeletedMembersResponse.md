# PinterestSdkClient::DeletedMembersResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **deleted_members** | **Array&lt;String&gt;** | List of members whose business membership have been terminated. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeletedMembersResponse.new(
  deleted_members: [&quot;809944451643622187&quot;,&quot;383791336903426391&quot;]
)
```

