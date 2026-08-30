# CampaignPlanningConversionRate

Conversion rate estimate for a specific conversion event and attribution window combination.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**CampaignPlanningConversionAttribution**](CampaignPlanningConversionAttribution.md) |  | [default to undefined]
**conversion_event** | [**CampaignPlanningConversionEvent**](CampaignPlanningConversionEvent.md) |  | [default to undefined]
**conversion_rate** | **number** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. | [default to undefined]

## Example

```typescript
import { CampaignPlanningConversionRate } from './api';

const instance: CampaignPlanningConversionRate = {
    attribution_windows,
    conversion_event,
    conversion_rate,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
