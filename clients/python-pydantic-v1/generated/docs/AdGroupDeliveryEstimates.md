# AdGroupDeliveryEstimates

Ad group configuration for delivery estimates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** |  | [optional] 
**creative_types** | [**List[AdGroupAudienceSizingCreativeTypes]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**List[AdGroupDeliveryEstimatesKeywordsItems]**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**monthly_frequency_cap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] 
**optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 
**optimization_type** | [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**product_group_ids** | **List[str]** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] 
**targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

## Example

```python
from openapi_client.models.ad_group_delivery_estimates import AdGroupDeliveryEstimates

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupDeliveryEstimates from a JSON string
ad_group_delivery_estimates_instance = AdGroupDeliveryEstimates.from_json(json)
# print the JSON string representation of the object
print AdGroupDeliveryEstimates.to_json()

# convert the object into a dict
ad_group_delivery_estimates_dict = ad_group_delivery_estimates_instance.to_dict()
# create an instance of AdGroupDeliveryEstimates from a dict
ad_group_delivery_estimates_from_dict = AdGroupDeliveryEstimates.from_dict(ad_group_delivery_estimates_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


