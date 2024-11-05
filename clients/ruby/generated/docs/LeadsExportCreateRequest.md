# PinterestSdkClient::LeadsExportCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_date** | **String** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **String** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD |  |
| **ad_id** | **String** | ID for the ad collecting leads |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadsExportCreateRequest.new(
  start_date: 2020-12-20,
  end_date: 2020-12-20,
  ad_id: 687201361754
)
```

