# PinterestSdkClient::BidFloorSpec

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **billable_event** | [**ActionType**](ActionType.md) | Ad group billable event type. |  |
| **countries** | [**Array&lt;Country&gt;**](Country.md) | List of ISO 3166-1 alpha-2 country codes. | [optional] |
| **creative_type** | [**CreativeType**](CreativeType.md) | Creative type for the bid floor request. | [optional] |
| **currency** | [**Currency**](Currency.md) | Currency for the bid floor value. |  |
| **objective_type** | [**BidFloorObjectiveType**](BidFloorObjectiveType.md) | Campaign objective type. | [optional] |
| **optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goal metadata. | [optional] |

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

