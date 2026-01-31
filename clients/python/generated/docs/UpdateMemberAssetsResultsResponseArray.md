# UpdateMemberAssetsResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[UpdateMemberAssetsResultsResponseArrayItemsInner]**](UpdateMemberAssetsResultsResponseArrayItemsInner.md) | List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned. | [optional] 

## Example

```python
from pinterestsdk.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMemberAssetsResultsResponseArray from a JSON string
update_member_assets_results_response_array_instance = UpdateMemberAssetsResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(UpdateMemberAssetsResultsResponseArray.to_json())

# convert the object into a dict
update_member_assets_results_response_array_dict = update_member_assets_results_response_array_instance.to_dict()
# create an instance of UpdateMemberAssetsResultsResponseArray from a dict
update_member_assets_results_response_array_from_dict = UpdateMemberAssetsResultsResponseArray.from_dict(update_member_assets_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


