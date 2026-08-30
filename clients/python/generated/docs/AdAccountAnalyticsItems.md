# AdAccountAnalyticsItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** |  | 
**var_date** | **date** |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_account_analytics_items import AdAccountAnalyticsItems

# TODO update the JSON string below
json = "{}"
# create an instance of AdAccountAnalyticsItems from a JSON string
ad_account_analytics_items_instance = AdAccountAnalyticsItems.from_json(json)
# print the JSON string representation of the object
print(AdAccountAnalyticsItems.to_json())

# convert the object into a dict
ad_account_analytics_items_dict = ad_account_analytics_items_instance.to_dict()
# create an instance of AdAccountAnalyticsItems from a dict
ad_account_analytics_items_from_dict = AdAccountAnalyticsItems.from_dict(ad_account_analytics_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


