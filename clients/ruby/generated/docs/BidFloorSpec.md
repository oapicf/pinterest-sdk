# PinterestSdkClient::BidFloorSpec

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **countries** | [**Array&lt;Country&gt;**](Country.md) |  | [optional] |
| **currency** | [**Currency**](Currency.md) |  |  |
| **objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] |
| **billable_event** | [**ActionType**](ActionType.md) |  |  |
| **optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BidFloorSpec.new(
  countries: null,
  currency: null,
  objective_type: null,
  billable_event: null,
  optimization_goal_metadata: null,
  creative_type: null
)
```

