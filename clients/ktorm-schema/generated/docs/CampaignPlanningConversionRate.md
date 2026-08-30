
# Table `CampaignPlanningConversionRate`
(mapped from: CampaignPlanningConversionRate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**attributionWindows** | attribution_windows | long NOT NULL |  | [**CampaignPlanningConversionAttribution**](CampaignPlanningConversionAttribution.md) |  |  [foreignkey]
**conversionEvent** | conversion_event | long NOT NULL |  | [**CampaignPlanningConversionEvent**](CampaignPlanningConversionEvent.md) |  |  [foreignkey]
**conversionRate** | conversion_rate | float NOT NULL |  | **kotlin.Float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. | 





