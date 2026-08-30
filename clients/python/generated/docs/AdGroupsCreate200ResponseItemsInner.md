# AdGroupsCreate200ResponseItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**AdGroup**](AdGroup.md) |  | [optional] 
**exceptions** | [**List[PinterestLibBatchItemException]**](PinterestLibBatchItemException.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.ad_groups_create200_response_items_inner import AdGroupsCreate200ResponseItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of AdGroupsCreate200ResponseItemsInner from a JSON string
ad_groups_create200_response_items_inner_instance = AdGroupsCreate200ResponseItemsInner.from_json(json)
# print the JSON string representation of the object
print(AdGroupsCreate200ResponseItemsInner.to_json())

# convert the object into a dict
ad_groups_create200_response_items_inner_dict = ad_groups_create200_response_items_inner_instance.to_dict()
# create an instance of AdGroupsCreate200ResponseItemsInner from a dict
ad_groups_create200_response_items_inner_from_dict = AdGroupsCreate200ResponseItemsInner.from_dict(ad_groups_create200_response_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


