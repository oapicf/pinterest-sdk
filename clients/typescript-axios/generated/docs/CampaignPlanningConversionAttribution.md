# CampaignPlanningConversionAttribution

Attribution windows for a conversion event.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**click_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to undefined]
**engagement_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. | [optional] [default to undefined]
**view_window_days** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to undefined]

## Example

```typescript
import { CampaignPlanningConversionAttribution } from './api';

const instance: CampaignPlanningConversionAttribution = {
    click_window_days,
    engagement_window_days,
    view_window_days,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
