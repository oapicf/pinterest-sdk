# PinterestSdkClient::DeliveryMetricsResponseItemsInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **category** | **String** | Category name | [optional] |
| **definition** | **String** | How the metric is defined. | [optional] |
| **display_name** | **String** | Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. | [optional] |
| **name** | **String** | Metric&#39;s name. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeliveryMetricsResponseItemsInner.new(
  category: ADS,
  definition: Unique ID for your ad group,
  display_name: Ad group ID,
  name: AD_GROUP_ID
)
```

