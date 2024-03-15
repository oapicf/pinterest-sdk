# PinterestSdkClient::ProductGroupAnalyticsResponseInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **product_group_id** | **String** | The ID of the product group that this metrics belongs to. |  |
| **date** | **Date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ProductGroupAnalyticsResponseInner.new(
  product_group_id: null,
  date: null
)
```

