# CampaignDeliveryEstimatesDerivedMetrics

Derived metrics for an ad campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpc** | **float** | Estimated cost per click. | [optional] 
**cpc_lower** | **float** | Lower estimate of the cost per click. | [optional] 
**cpc_upper** | **float** | Upper estimate of the cost per click. | [optional] 
**cpm** | **float** | Estimated cost per thousand impressions. | [optional] 
**cpm_lower** | **float** | Lower estimate of cost per thousand impressions. | [optional] 
**cpm_upper** | **float** | Upper estimate of cost per thousand impressions. | [optional] 
**lifetime_frequency** | **float** | Estimated lifetime frequency. | [optional] 
**lifetime_frequency_lower** | **float** | Lower estimate of lifetime frequency. | [optional] 
**lifetime_frequency_upper** | **float** | Upper estimate of lifetime frequency. | [optional] 
**lifetime_impression** | **float** | Estimated lifetime impressions. | [optional] 
**lifetime_impression_lower** | **float** | Lower estimate of lifetime impressions. | [optional] 
**lifetime_impression_upper** | **float** | Upper estimate of lifetime impressions. | [optional] 
**lifetime_reach** | **float** | Estimated lifetime reach. | [optional] 
**lifetime_reach_lower** | **float** | Lower estimate of lifetime reach. | [optional] 
**lifetime_reach_upper** | **float** | Upper estimate of lifetime reach. | [optional] 
**weekly_click** | **float** | Estimated weekly clicks. | [optional] 
**weekly_click_lower** | **float** | Lower estimate of weekly clicks. | [optional] 
**weekly_click_upper** | **float** | Upper estimate of weekly clicks. | [optional] 
**weekly_frequency** | **float** | Estimated weekly frequency. | [optional] 
**weekly_frequency_lower** | **float** | Lower estimate of weekly frequency. | [optional] 
**weekly_frequency_upper** | **float** | Upper estimate of weekly frequency. | [optional] 
**weekly_impression** | **float** | Estimated weekly impressions. | [optional] 
**weekly_impression_lower** | **float** | Lower estimate of weekly impressions. | [optional] 
**weekly_impression_upper** | **float** | Upper estimate of weekly impressions. | [optional] 
**weekly_reach** | **float** | Estimated weekly reach. | [optional] 
**weekly_reach_lower** | **float** | Lower estimate of weekly reach. | [optional] 
**weekly_reach_upper** | **float** | Upper estimate of weekly reach. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_delivery_estimates_derived_metrics import CampaignDeliveryEstimatesDerivedMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignDeliveryEstimatesDerivedMetrics from a JSON string
campaign_delivery_estimates_derived_metrics_instance = CampaignDeliveryEstimatesDerivedMetrics.from_json(json)
# print the JSON string representation of the object
print(CampaignDeliveryEstimatesDerivedMetrics.to_json())

# convert the object into a dict
campaign_delivery_estimates_derived_metrics_dict = campaign_delivery_estimates_derived_metrics_instance.to_dict()
# create an instance of CampaignDeliveryEstimatesDerivedMetrics from a dict
campaign_delivery_estimates_derived_metrics_from_dict = CampaignDeliveryEstimatesDerivedMetrics.from_dict(campaign_delivery_estimates_derived_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


