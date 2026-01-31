# DeleteAssetGroupResponseExceptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **str** | Asset group id of the exception. | [optional] 
**code** | **int** | Error code associated with the error deleting asset group. | [optional] 
**message** | **str** | Error message associated with the error deleting asset group. | [optional] 

## Example

```python
from pinterestsdk.models.delete_asset_group_response_exceptions_inner import DeleteAssetGroupResponseExceptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteAssetGroupResponseExceptionsInner from a JSON string
delete_asset_group_response_exceptions_inner_instance = DeleteAssetGroupResponseExceptionsInner.from_json(json)
# print the JSON string representation of the object
print(DeleteAssetGroupResponseExceptionsInner.to_json())

# convert the object into a dict
delete_asset_group_response_exceptions_inner_dict = delete_asset_group_response_exceptions_inner_instance.to_dict()
# create an instance of DeleteAssetGroupResponseExceptionsInner from a dict
delete_asset_group_response_exceptions_inner_from_dict = DeleteAssetGroupResponseExceptionsInner.from_dict(delete_asset_group_response_exceptions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


