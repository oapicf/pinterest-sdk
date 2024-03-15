# PinterestSdkClient::KeywordUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Keyword ID. |  |
| **archived** | **Boolean** | Is keyword archived? | [optional] |
| **bid** | **Integer** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordUpdate.new(
  id: 2886364308355,
  archived: false,
  bid: 200000
)
```

