# AdGroupDeliveryEstimatesKeywordsItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**match_type** | [**NullalbleMatchType**](NullalbleMatchType.md) |  | 
**value** | **str** | Keyword value (120 chars max). | 

## Example

```python
from pinterestsdk.models.ad_group_delivery_estimates_keywords_items import AdGroupDeliveryEstimatesKeywordsItems

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupDeliveryEstimatesKeywordsItems from a JSON string
ad_group_delivery_estimates_keywords_items_instance = AdGroupDeliveryEstimatesKeywordsItems.from_json(json)
# print the JSON string representation of the object
print(AdGroupDeliveryEstimatesKeywordsItems.to_json())

# convert the object into a dict
ad_group_delivery_estimates_keywords_items_dict = ad_group_delivery_estimates_keywords_items_instance.to_dict()
# create an instance of AdGroupDeliveryEstimatesKeywordsItems from a dict
ad_group_delivery_estimates_keywords_items_from_dict = AdGroupDeliveryEstimatesKeywordsItems.from_dict(ad_group_delivery_estimates_keywords_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


