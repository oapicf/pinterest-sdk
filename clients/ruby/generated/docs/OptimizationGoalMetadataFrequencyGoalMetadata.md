# PinterestSdkClient::OptimizationGoalMetadataFrequencyGoalMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **frequency** | **Integer** | Frequency target can only be between 2 and 20 | [optional] |
| **timerange** | **String** | User entity counts time range | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OptimizationGoalMetadataFrequencyGoalMetadata.new(
  frequency: null,
  timerange: DAY
)
```

