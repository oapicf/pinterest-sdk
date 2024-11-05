# PinterestSdkClient::BusinessMemberAssetsGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;AssetIdPermissions&gt;**](AssetIdPermissions.md) | List asset permissions the given member was granted. |  |
| **bookmark** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessMemberAssetsGet200Response.new(
  items: null,
  bookmark: null
)
```

