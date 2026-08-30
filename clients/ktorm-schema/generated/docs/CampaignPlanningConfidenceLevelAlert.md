
# Table `CampaignPlanningConfidenceLevelAlert`
(mapped from: CampaignPlanningConfidenceLevelAlert)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**description** | description | text |  | **kotlin.String** | Human-readable context for debugging. Not intended for display to end users. |  [optional]
**reason** | reason | long |  | [**CampaignPlanningConfidenceLevelAlertReason**](CampaignPlanningConfidenceLevelAlertReason.md) | Reason for the confidence level alert. |  [optional] [foreignkey]
**severity** | severity | long |  | [**CampaignPlanningConfidenceLevelAlertSeverity**](CampaignPlanningConfidenceLevelAlertSeverity.md) | Severity of the confidence level alert. |  [optional] [foreignkey]





