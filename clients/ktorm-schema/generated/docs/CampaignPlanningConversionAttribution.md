
# Table `CampaignPlanningConversionAttribution`
(mapped from: CampaignPlanningConversionAttribution)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**clickWindowDays** | click_window_days | long |  | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. |  [optional] [foreignkey]
**engagementWindowDays** | engagement_window_days | long |  | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. |  [optional] [foreignkey]
**viewWindowDays** | view_window_days | long |  | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. |  [optional] [foreignkey]





