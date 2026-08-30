# PinterestSdkClient::BulkCampaignDeliveryEstimatesItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **adgroup_audience_sizes** | [**Array&lt;CampaignPlanningAdGroupAudienceSize&gt;**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] |
| **conversion_rate** | **Float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] |
| **conversion_rates** | [**Array&lt;CampaignPlanningConversionRate&gt;**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] |
| **curves** | [**Array&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] |
| **derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] |
| **errors** | [**Array&lt;CampaignPlanningResponseError&gt;**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] |
| **estimate_id** | **String** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] |
| **max_potential_spend** | **Integer** | Maximum potential spend estimate. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkCampaignDeliveryEstimatesItem.new(
  adgroup_audience_sizes: null,
  conversion_rate: 2.32600002288818,
  conversion_rates: null,
  curves: null,
  derived_metrics: null,
  errors: null,
  estimate_id: db1b0d75-4386-4db3-8a85-e5725d4dff51,
  max_potential_spend: 50000000
)
```

