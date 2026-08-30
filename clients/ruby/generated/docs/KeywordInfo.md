# PinterestSdkClient::KeywordInfo

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Keyword Name |  |
| **pct_growth_mom** | **Float** | MoM growth as a percentage, if there is no growth rate, this field is not present | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordInfo.new(
  name: null,
  pct_growth_mom: null
)
```

