# PinterestSdkClient::BidFloorSpec

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **billable_event** | [**ActionType**](ActionType.md) |  |  |
| **countries** | [**Array&lt;Country&gt;**](Country.md) |  | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] |
| **currency** | [**Currency**](Currency.md) |  |  |
| **objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] |
| **optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BidFloorSpec.new(
  billable_event: null,
  countries: null,
  creative_type: null,
  currency: null,
  objective_type: null,
  optimization_goal_metadata: null
)
```

