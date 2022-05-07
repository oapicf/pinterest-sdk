# PinterestSdkClient::AdsAnalyticsMetricsFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **field** | [**AdsAnalyticsFilterColumn**](AdsAnalyticsFilterColumn.md) |  | [optional] |
| **operator** | [**AdsAnalyticsFilterOperator**](AdsAnalyticsFilterOperator.md) |  | [optional] |
| **values** | **Array&lt;Float&gt;** | List of values for filtering | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsAnalyticsMetricsFilter.new(
  field: null,
  operator: null,
  values: null
)
```

