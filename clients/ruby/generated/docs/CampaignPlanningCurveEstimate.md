# PinterestSdkClient::CampaignPlanningCurveEstimate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **estimation_type** | [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for campaign planning estimated curve | [optional] |
| **points** | [**Array&lt;CampaignPlanningPointEstimate&gt;**](CampaignPlanningPointEstimate.md) | The estimation points that make up the estimated curve. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningCurveEstimate.new(
  estimation_type: IMPRESSION,
  points: null
)
```

