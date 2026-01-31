# PinterestSdkClient::BusinessAssetsGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** |  | [optional] |
| **items** | [**Array&lt;GetBusinessAssetsResponse&gt;**](GetBusinessAssetsResponse.md) | List of assets the requesting business has access to. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessAssetsGet200Response.new(
  bookmark: null,
  items: null
)
```

