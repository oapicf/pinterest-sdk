# PinterestSdkClient::KeywordCreateItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid** | **Integer** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] |
| **match_type** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) |  |
| **value** | **String** | Keyword value (120 chars max). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordCreateItem.new(
  bid: null,
  match_type: null,
  value: null
)
```

