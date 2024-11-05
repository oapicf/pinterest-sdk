# PinterestSdkClient::SharedAudienceResponseCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **audience_id** | **String** | Audience ID that was shared | [optional] |
| **permissions** | [**Array&lt;Role&gt;**](Role.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::SharedAudienceResponseCommon.new(
  audience_id: 2542621871096,
  permissions: [&quot;RESOURCE_PINNER_LIST_READER&quot;,&quot;RESOURCE_PINNER_LIST_OWNER&quot;]
)
```

