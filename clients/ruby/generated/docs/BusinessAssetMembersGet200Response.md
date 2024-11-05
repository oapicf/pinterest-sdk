# PinterestSdkClient::BusinessAssetMembersGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;UserSingleAssetBinding&gt;**](UserSingleAssetBinding.md) | List of members with permissions to the asset. |  |
| **bookmark** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessAssetMembersGet200Response.new(
  items: null,
  bookmark: null
)
```

