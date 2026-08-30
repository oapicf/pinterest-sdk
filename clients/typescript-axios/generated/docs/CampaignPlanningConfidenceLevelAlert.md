# CampaignPlanningConfidenceLevelAlert

A confidence level alert for the delivery estimates provided in the response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **string** | Human-readable context for debugging. Not intended for display to end users. | [optional] [default to undefined]
**reason** | [**CampaignPlanningConfidenceLevelAlertReason**](CampaignPlanningConfidenceLevelAlertReason.md) | Reason for the confidence level alert. | [optional] [default to undefined]
**severity** | [**CampaignPlanningConfidenceLevelAlertSeverity**](CampaignPlanningConfidenceLevelAlertSeverity.md) | Severity of the confidence level alert. | [optional] [default to undefined]

## Example

```typescript
import { CampaignPlanningConfidenceLevelAlert } from './api';

const instance: CampaignPlanningConfidenceLevelAlert = {
    description,
    reason,
    severity,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
