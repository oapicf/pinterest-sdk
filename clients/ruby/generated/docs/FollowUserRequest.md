# PinterestSdkClient::FollowUserRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_follow** | **Boolean** | Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed. | [optional][default to false] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::FollowUserRequest.new(
  auto_follow: false
)
```

