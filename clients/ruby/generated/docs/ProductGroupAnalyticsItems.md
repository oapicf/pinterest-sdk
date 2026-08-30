# PinterestSdkClient::ProductGroupAnalyticsItems

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **date** | **Date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] |
| **product_group_id** | **String** | The ID of the product group that this metrics belongs to. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ProductGroupAnalyticsItems.new(
  date: null,
  product_group_id: null
)
```

