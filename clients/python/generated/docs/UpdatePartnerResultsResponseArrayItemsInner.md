# UpdatePartnerResultsResponseArrayItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**BusinessAccessError**](BusinessAccessError.md) |  | [optional] 
**member_or_partner_id** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.update_partner_results_response_array_items_inner import UpdatePartnerResultsResponseArrayItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerResultsResponseArrayItemsInner from a JSON string
update_partner_results_response_array_items_inner_instance = UpdatePartnerResultsResponseArrayItemsInner.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerResultsResponseArrayItemsInner.to_json())

# convert the object into a dict
update_partner_results_response_array_items_inner_dict = update_partner_results_response_array_items_inner_instance.to_dict()
# create an instance of UpdatePartnerResultsResponseArrayItemsInner from a dict
update_partner_results_response_array_items_inner_from_dict = UpdatePartnerResultsResponseArrayItemsInner.from_dict(update_partner_results_response_array_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


