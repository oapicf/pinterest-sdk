# PinterestSdkClient::CampaignPlanningConfidenceLevelAlert

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **description** | **String** | Human-readable context for debugging. Not intended for display to end users. | [optional] |
| **reason** | [**CampaignPlanningConfidenceLevelAlertReason**](CampaignPlanningConfidenceLevelAlertReason.md) | Reason for the confidence level alert. | [optional] |
| **severity** | [**CampaignPlanningConfidenceLevelAlertSeverity**](CampaignPlanningConfidenceLevelAlertSeverity.md) | Severity of the confidence level alert. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignPlanningConfidenceLevelAlert.new(
  description: null,
  reason: null,
  severity: null
)
```

