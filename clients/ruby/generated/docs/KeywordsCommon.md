# PinterestSdkClient::KeywordsCommon

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid** | **Integer** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] |
| **match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  |  |
| **value** | **String** | Keyword value (120 chars max). |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordsCommon.new(
  bid: null,
  match_type: null,
  value: null
)
```

