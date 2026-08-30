# CampaignDeliveryEstimatesCampaign

Campaign configuration for delivery estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**List[AdGroupDeliveryEstimates]**](AdGroupDeliveryEstimates.md) |  | 
**budget_duration_type** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | 
**daily_spend_cap** | **int** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] 
**end_date** | **str** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] 
**lifetime_spend_cap** | **int** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] 
**objective_type** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | 
**start_date** | **str** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 

## Example

```python
from pinterestsdk.models.campaign_delivery_estimates_campaign import CampaignDeliveryEstimatesCampaign

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignDeliveryEstimatesCampaign from a JSON string
campaign_delivery_estimates_campaign_instance = CampaignDeliveryEstimatesCampaign.from_json(json)
# print the JSON string representation of the object
print(CampaignDeliveryEstimatesCampaign.to_json())

# convert the object into a dict
campaign_delivery_estimates_campaign_dict = campaign_delivery_estimates_campaign_instance.to_dict()
# create an instance of CampaignDeliveryEstimatesCampaign from a dict
campaign_delivery_estimates_campaign_from_dict = CampaignDeliveryEstimatesCampaign.from_dict(campaign_delivery_estimates_campaign_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


