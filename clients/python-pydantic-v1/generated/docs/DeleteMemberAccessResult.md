# DeleteMemberAccessResult

The terminated asset access.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of the business asset. | [optional] 
**member_id** | **str** | Unique identifier of the business member. | [optional] 

## Example

```python
from openapi_client.models.delete_member_access_result import DeleteMemberAccessResult

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteMemberAccessResult from a JSON string
delete_member_access_result_instance = DeleteMemberAccessResult.from_json(json)
# print the JSON string representation of the object
print DeleteMemberAccessResult.to_json()

# convert the object into a dict
delete_member_access_result_dict = delete_member_access_result_instance.to_dict()
# create an instance of DeleteMemberAccessResult from a dict
delete_member_access_result_from_dict = DeleteMemberAccessResult.from_dict(delete_member_access_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


