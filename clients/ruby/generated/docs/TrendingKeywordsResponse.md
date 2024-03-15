# PinterestSdkClient::TrendingKeywordsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **trends** | [**Array&lt;TrendingKeywordsResponseTrendsInner&gt;**](TrendingKeywordsResponseTrendsInner.md) | The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TrendingKeywordsResponse.new(
  trends: null
)
```

