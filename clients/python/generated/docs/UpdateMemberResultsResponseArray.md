# UpdateMemberResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[UpdateMemberResult]**](UpdateMemberResult.md) | List of members with updated business access role. | [optional] 

## Example

```python
from pinterestsdk.models.update_member_results_response_array import UpdateMemberResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMemberResultsResponseArray from a JSON string
update_member_results_response_array_instance = UpdateMemberResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(UpdateMemberResultsResponseArray.to_json())

# convert the object into a dict
update_member_results_response_array_dict = update_member_results_response_array_instance.to_dict()
# create an instance of UpdateMemberResultsResponseArray from a dict
update_member_results_response_array_from_dict = UpdateMemberResultsResponseArray.from_dict(update_member_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


