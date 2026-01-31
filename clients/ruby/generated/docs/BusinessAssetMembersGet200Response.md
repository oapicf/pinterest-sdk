# PinterestSdkClient::BusinessAssetMembersGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** |  | [optional] |
| **items** | [**Array&lt;UserSingleAssetBinding&gt;**](UserSingleAssetBinding.md) | List of members with permissions to the asset. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessAssetMembersGet200Response.new(
  bookmark: null,
  items: null
)
```

