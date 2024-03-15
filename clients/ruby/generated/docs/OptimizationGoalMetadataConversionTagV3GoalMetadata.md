# PinterestSdkClient::OptimizationGoalMetadataConversionTagV3GoalMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attribution_windows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  | [optional] |
| **conversion_event** | **String** |  | [optional] |
| **conversion_tag_id** | **String** |  | [optional] |
| **cpa_goal_value_in_micro_currency** | **String** |  | [optional] |
| **is_roas_optimized** | **Boolean** | Ad group is ROAS optimized | [optional] |
| **learning_mode_type** | **String** | Conversion learning model type | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OptimizationGoalMetadataConversionTagV3GoalMetadata.new(
  attribution_windows: null,
  conversion_event: null,
  conversion_tag_id: null,
  cpa_goal_value_in_micro_currency: null,
  is_roas_optimized: null,
  learning_mode_type: ACTIVE
)
```

