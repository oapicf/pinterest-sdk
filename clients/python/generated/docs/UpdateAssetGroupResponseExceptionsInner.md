# UpdateAssetGroupResponseExceptionsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_id** | **str** | Asset group id of the exception. | [optional] 
**code** | **int** | Error code associated with the error editing asset group. | [optional] 
**message** | **str** | Error message associated with the error editing asset group. | [optional] 

## Example

```python
from pinterestsdk.models.update_asset_group_response_exceptions_inner import UpdateAssetGroupResponseExceptionsInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateAssetGroupResponseExceptionsInner from a JSON string
update_asset_group_response_exceptions_inner_instance = UpdateAssetGroupResponseExceptionsInner.from_json(json)
# print the JSON string representation of the object
print(UpdateAssetGroupResponseExceptionsInner.to_json())

# convert the object into a dict
update_asset_group_response_exceptions_inner_dict = update_asset_group_response_exceptions_inner_instance.to_dict()
# create an instance of UpdateAssetGroupResponseExceptionsInner from a dict
update_asset_group_response_exceptions_inner_from_dict = UpdateAssetGroupResponseExceptionsInner.from_dict(update_asset_group_response_exceptions_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


