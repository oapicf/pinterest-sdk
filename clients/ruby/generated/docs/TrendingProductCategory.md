# PinterestSdkClient::TrendingProductCategory

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **engagement_type** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) | Engagement type |  |
| **pct_change_mom** | **Integer** | Month-over-month change percentage |  |
| **percent_relative_volume** | **Integer** | Relative volume percentage |  |
| **product_category** | **String** | Product Category Name |  |
| **verticals** | [**Array&lt;VerticalProductCategory&gt;**](VerticalProductCategory.md) | Vertical name associated with the product category | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TrendingProductCategory.new(
  engagement_type: null,
  pct_change_mom: null,
  percent_relative_volume: null,
  product_category: null,
  verticals: null
)
```

