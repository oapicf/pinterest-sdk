# PinterestSdkClient::ScheduleBidOptions

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **age_bucket_multipliers** | [**ScheduleAgeBucketMultipliers**](ScheduleAgeBucketMultipliers.md) |  | [optional] |
| **app_type_multipliers** | [**ScheduleAppTypeMultipliers**](ScheduleAppTypeMultipliers.md) |  | [optional] |
| **audience_multipliers** | [**ScheduleAudienceMultipliers**](ScheduleAudienceMultipliers.md) |  | [optional] |
| **gender_multipliers** | [**ScheduleBidOptionsGenderMultipliers**](ScheduleBidOptionsGenderMultipliers.md) |  | [optional] |
| **placement_multipliers** | [**ScheduleBidOptionsPlacementMultipliers**](ScheduleBidOptionsPlacementMultipliers.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ScheduleBidOptions.new(
  age_bucket_multipliers: null,
  app_type_multipliers: null,
  audience_multipliers: null,
  gender_multipliers: null,
  placement_multipliers: null
)
```

