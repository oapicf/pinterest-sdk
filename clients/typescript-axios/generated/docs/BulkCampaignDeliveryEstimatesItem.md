# BulkCampaignDeliveryEstimatesItem

Delivery estimate result for a single campaign within a bulk request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**Array&lt;CampaignPlanningAdGroupAudienceSize&gt;**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] [default to undefined]
**conversion_rate** | **number** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] [default to undefined]
**conversion_rates** | [**Array&lt;CampaignPlanningConversionRate&gt;**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] [default to undefined]
**curves** | [**Array&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [default to undefined]
**derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] [default to undefined]
**errors** | [**Array&lt;CampaignPlanningResponseError&gt;**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] [default to undefined]
**estimate_id** | **string** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] [default to undefined]
**max_potential_spend** | **number** | Maximum potential spend estimate. | [optional] [default to undefined]

## Example

```typescript
import { BulkCampaignDeliveryEstimatesItem } from './api';

const instance: BulkCampaignDeliveryEstimatesItem = {
    adgroup_audience_sizes,
    conversion_rate,
    conversion_rates,
    curves,
    derived_metrics,
    errors,
    estimate_id,
    max_potential_spend,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
