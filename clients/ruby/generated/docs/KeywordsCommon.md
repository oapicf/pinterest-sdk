# PinterestSdkClient::KeywordsCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid** | **Integer** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] |
| **match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  |  |
| **value** | **String** | Keyword value (120 chars max). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordsCommon.new(
  bid: 200000,
  match_type: null,
  value: null
)
```

