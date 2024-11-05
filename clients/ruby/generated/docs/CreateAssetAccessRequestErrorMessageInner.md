# PinterestSdkClient::CreateAssetAccessRequestErrorMessageInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **code** | **Integer** | Error code associated with the error in requesting asset access. | [optional] |
| **messages** | **Array&lt;String&gt;** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateAssetAccessRequestErrorMessageInner.new(
  code: 2932,
  messages: [&quot;Invalid asset id: 549760723247&quot;,&quot;Invalid asset id: 546760723248&quot;]
)
```

