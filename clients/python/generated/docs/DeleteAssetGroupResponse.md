# DeleteAssetGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted_asset_groups** | **List[str]** | A list of ids of successfully deleted asset groups. | [optional] 
**exceptions** | [**List[DeleteAssetGroupResponseExceptionsInner]**](DeleteAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] 

## Example

```python
from pinterestsdk.models.delete_asset_group_response import DeleteAssetGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteAssetGroupResponse from a JSON string
delete_asset_group_response_instance = DeleteAssetGroupResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteAssetGroupResponse.to_json())

# convert the object into a dict
delete_asset_group_response_dict = delete_asset_group_response_instance.to_dict()
# create an instance of DeleteAssetGroupResponse from a dict
delete_asset_group_response_from_dict = DeleteAssetGroupResponse.from_dict(delete_asset_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


