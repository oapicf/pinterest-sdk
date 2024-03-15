# PinterestSdkClient::AdAccountAnalyticsResponseInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | The ID of the advertiser that this metrics belongs to. |  |
| **date** | **Date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdAccountAnalyticsResponseInner.new(
  ad_account_id: null,
  date: null
)
```

