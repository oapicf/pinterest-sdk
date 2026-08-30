# BulkCampaignDeliveryEstimatesItem

Delivery estimate result for a single campaign within a bulk request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**List[CampaignPlanningAdGroupAudienceSize]**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**conversion_rate** | **float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**conversion_rates** | [**List[CampaignPlanningConversionRate]**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**curves** | [**List[CampaignPlanningCurveEstimate]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**errors** | [**List[CampaignPlanningResponseError]**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**estimate_id** | **str** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**max_potential_spend** | **int** | Maximum potential spend estimate. | [optional] 

## Example

```python
from pinterestsdk.models.bulk_campaign_delivery_estimates_item import BulkCampaignDeliveryEstimatesItem

# TODO update the JSON string below
json = "{}"
# create an instance of BulkCampaignDeliveryEstimatesItem from a JSON string
bulk_campaign_delivery_estimates_item_instance = BulkCampaignDeliveryEstimatesItem.from_json(json)
# print the JSON string representation of the object
print(BulkCampaignDeliveryEstimatesItem.to_json())

# convert the object into a dict
bulk_campaign_delivery_estimates_item_dict = bulk_campaign_delivery_estimates_item_instance.to_dict()
# create an instance of BulkCampaignDeliveryEstimatesItem from a dict
bulk_campaign_delivery_estimates_item_from_dict = BulkCampaignDeliveryEstimatesItem.from_dict(bulk_campaign_delivery_estimates_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


