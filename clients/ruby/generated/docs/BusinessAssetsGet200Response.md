# PinterestSdkClient::BusinessAssetsGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;GetBusinessAssetsResponse&gt;**](GetBusinessAssetsResponse.md) | List of assets the requesting business has access to. |  |
| **bookmark** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessAssetsGet200Response.new(
  items: null,
  bookmark: null
)
```

