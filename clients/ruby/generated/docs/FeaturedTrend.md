# PinterestSdkClient::FeaturedTrend

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **interest** | [**InterestsEnum**](InterestsEnum.md) | The main interest category |  |
| **market** | [**ProductCategoryRegion**](ProductCategoryRegion.md) | Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.) | [optional] |
| **trends** | [**Array&lt;TrendingTopic&gt;**](TrendingTopic.md) | List of trending topics within this interest category | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::FeaturedTrend.new(
  interest: null,
  market: null,
  trends: null
)
```

