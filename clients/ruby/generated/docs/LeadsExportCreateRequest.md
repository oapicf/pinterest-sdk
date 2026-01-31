# PinterestSdkClient::LeadsExportCreateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_id** | **String** | ID for the ad collecting leads |  |
| **end_date** | **String** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD |  |
| **start_date** | **String** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::LeadsExportCreateRequest.new(
  ad_id: 687201361754,
  end_date: 2020-12-20,
  start_date: 2020-12-20
)
```

