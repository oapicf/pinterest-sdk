# PinterestSdkClient::KeywordMetricsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **keyword** | **String** | Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot; | [optional] |
| **metrics** | [**KeywordMetrics**](KeywordMetrics.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::KeywordMetricsResponse.new(
  keyword: animals,
  metrics: null
)
```

