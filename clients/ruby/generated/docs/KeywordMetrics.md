# PinterestSdkClient::KeywordMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **avg_cpc_in_micro_currency** | **Float** | Average cost per click | [optional] |
| **keyword_query_volume** | **String** | Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordMetrics.new(
  avg_cpc_in_micro_currency: 100000,
  keyword_query_volume: 5M+
)
```

