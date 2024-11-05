# PinterestSdkClient::BusinessAssetPartnersGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;UserSingleAssetBinding&gt;**](UserSingleAssetBinding.md) | List of partners with permissions to the asset. |  |
| **bookmark** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessAssetPartnersGet200Response.new(
  items: null,
  bookmark: null
)
```

