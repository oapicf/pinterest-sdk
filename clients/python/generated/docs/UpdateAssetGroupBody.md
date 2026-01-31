# UpdateAssetGroupBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_groups_to_update** | [**List[UpdateAssetGroupBodyAssetGroupsToUpdateInner]**](UpdateAssetGroupBodyAssetGroupsToUpdateInner.md) | A list of asset groups and the data that will be used to update them. | [optional] 

## Example

```python
from pinterestsdk.models.update_asset_group_body import UpdateAssetGroupBody

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateAssetGroupBody from a JSON string
update_asset_group_body_instance = UpdateAssetGroupBody.from_json(json)
# print the JSON string representation of the object
print(UpdateAssetGroupBody.to_json())

# convert the object into a dict
update_asset_group_body_dict = update_asset_group_body_instance.to_dict()
# create an instance of UpdateAssetGroupBody from a dict
update_asset_group_body_from_dict = UpdateAssetGroupBody.from_dict(update_asset_group_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


