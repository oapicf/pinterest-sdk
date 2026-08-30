# PinterestSdkClient::CampaignPlanningAdGroupAudienceSize

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **count_lower** | **Integer** | Lower bound of the audience size estimate. | [optional] |
| **count_upper** | **Integer** | Upper bound of the audience size estimate. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningAdGroupAudienceSize.new(
  count_lower: 1000000,
  count_upper: 2000000
)
```

