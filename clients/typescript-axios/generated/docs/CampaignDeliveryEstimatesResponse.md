# CampaignDeliveryEstimatesResponse

Delivery estimates response for a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**curves** | [**Array&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [default to undefined]
**derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] [default to undefined]
**max_potential_spend** | **number** | Maximum potential spend estimate. | [optional] [default to undefined]

## Example

```typescript
import { CampaignDeliveryEstimatesResponse } from './api';

const instance: CampaignDeliveryEstimatesResponse = {
    curves,
    derived_metrics,
    max_potential_spend,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
