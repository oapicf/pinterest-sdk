# PinterestSdkClient::AdGroupCommonOptimizationGoalMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **conversion_tag_v3_goal_metadata** | [**OptimizationGoalMetadataConversionTagV3GoalMetadata**](OptimizationGoalMetadataConversionTagV3GoalMetadata.md) |  | [optional] |
| **frequency_goal_metadata** | [**OptimizationGoalMetadataFrequencyGoalMetadata**](OptimizationGoalMetadataFrequencyGoalMetadata.md) |  | [optional] |
| **scrollup_goal_metadata** | [**OptimizationGoalMetadataScrollupGoalMetadata**](OptimizationGoalMetadataScrollupGoalMetadata.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupCommonOptimizationGoalMetadata.new(
  conversion_tag_v3_goal_metadata: null,
  frequency_goal_metadata: null,
  scrollup_goal_metadata: null
)
```

