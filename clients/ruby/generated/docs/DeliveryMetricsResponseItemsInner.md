# PinterestSdkClient::DeliveryMetricsResponseItemsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Metric&#39;s name. | [optional] |
| **category** | **String** | Category name | [optional] |
| **definition** | **String** | How the metric is defined. | [optional] |
| **display_name** | **String** | Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeliveryMetricsResponseItemsInner.new(
  name: AD_GROUP_ID,
  category: ADS,
  definition: Unique ID for your ad group,
  display_name: Ad group ID
)
```

