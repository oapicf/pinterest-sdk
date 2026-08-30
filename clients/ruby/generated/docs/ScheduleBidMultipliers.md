# PinterestSdkClient::ScheduleBidMultipliers

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **age_bucket_multipliers** | [**BidOptionsAgeBucketMultipliers**](BidOptionsAgeBucketMultipliers.md) |  | [optional] |
| **app_type_multipliers** | [**BidOptionsAppTypeMultipliers**](BidOptionsAppTypeMultipliers.md) |  | [optional] |
| **audience_multipliers** | [**Array&lt;BidOptionsAudienceMultipliers&gt;**](BidOptionsAudienceMultipliers.md) |  | [optional] |
| **gender_multipliers** | [**BidOptionsGenderMultipliers**](BidOptionsGenderMultipliers.md) |  | [optional] |
| **placement_multipliers** | [**BidOptionsPlacementMultipliers**](BidOptionsPlacementMultipliers.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ScheduleBidMultipliers.new(
  age_bucket_multipliers: null,
  app_type_multipliers: null,
  audience_multipliers: null,
  gender_multipliers: null,
  placement_multipliers: null
)
```

