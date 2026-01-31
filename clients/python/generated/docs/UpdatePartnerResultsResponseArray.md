# UpdatePartnerResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[UpdatePartnerResultsResponseArrayItemsInner]**](UpdatePartnerResultsResponseArrayItemsInner.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.update_partner_results_response_array import UpdatePartnerResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerResultsResponseArray from a JSON string
update_partner_results_response_array_instance = UpdatePartnerResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerResultsResponseArray.to_json())

# convert the object into a dict
update_partner_results_response_array_dict = update_partner_results_response_array_instance.to_dict()
# create an instance of UpdatePartnerResultsResponseArray from a dict
update_partner_results_response_array_from_dict = UpdatePartnerResultsResponseArray.from_dict(update_partner_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


