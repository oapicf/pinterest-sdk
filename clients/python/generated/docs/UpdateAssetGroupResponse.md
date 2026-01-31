# UpdateAssetGroupResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | [**List[UpdateAssetGroupResponseExceptionsInner]**](UpdateAssetGroupResponseExceptionsInner.md) | A list of errors associated with the asset groups. Will be returned if there is an error. | [optional] 
**updated_asset_groups** | [**List[AssetGroupBinding]**](AssetGroupBinding.md) | A list of successfully edited asset groups. | [optional] 

## Example

```python
from pinterestsdk.models.update_asset_group_response import UpdateAssetGroupResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateAssetGroupResponse from a JSON string
update_asset_group_response_instance = UpdateAssetGroupResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateAssetGroupResponse.to_json())

# convert the object into a dict
update_asset_group_response_dict = update_asset_group_response_instance.to_dict()
# create an instance of UpdateAssetGroupResponse from a dict
update_asset_group_response_from_dict = UpdateAssetGroupResponse.from_dict(update_asset_group_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


