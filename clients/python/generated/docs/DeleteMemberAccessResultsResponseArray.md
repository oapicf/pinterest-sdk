# DeleteMemberAccessResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[DeleteMemberAccessResult]**](DeleteMemberAccessResult.md) | List of member asset permissions that were deleted. | [optional] 

## Example

```python
from pinterestsdk.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteMemberAccessResultsResponseArray from a JSON string
delete_member_access_results_response_array_instance = DeleteMemberAccessResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(DeleteMemberAccessResultsResponseArray.to_json())

# convert the object into a dict
delete_member_access_results_response_array_dict = delete_member_access_results_response_array_instance.to_dict()
# create an instance of DeleteMemberAccessResultsResponseArray from a dict
delete_member_access_results_response_array_from_dict = DeleteMemberAccessResultsResponseArray.from_dict(delete_member_access_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


