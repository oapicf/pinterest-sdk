# PinterestSdkClient::CampaignPlanningPointEstimate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **budget** | **Integer** | The budget value of the point. |  |
| **double_y** | **Float** | Y value as a decimal. |  |
| **max_y** | **Integer** | The maximum Y value of the point. |  |
| **min_y** | **Integer** | The minimum Y value of the point. |  |
| **y** | **Integer** | The expected Y value of the point. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningPointEstimate.new(
  budget: 5000000,
  double_y: 10.68,
  max_y: 2000,
  min_y: 1000,
  y: 1500
)
```

