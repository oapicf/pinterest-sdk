# UpdateMemberAssetAccessItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Id of the asset to update. | 
**member_id** | **str** | Unique identifier of the member on which to perform the update | 
**permissions** | [**List[Permissions]**](Permissions.md) | A non-empty array of permissions to assign to the member. | 

## Example

```python
from openapi_client.models.update_member_asset_access_item import UpdateMemberAssetAccessItem

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMemberAssetAccessItem from a JSON string
update_member_asset_access_item_instance = UpdateMemberAssetAccessItem.from_json(json)
# print the JSON string representation of the object
print UpdateMemberAssetAccessItem.to_json()

# convert the object into a dict
update_member_asset_access_item_dict = update_member_asset_access_item_instance.to_dict()
# create an instance of UpdateMemberAssetAccessItem from a dict
update_member_asset_access_item_from_dict = UpdateMemberAssetAccessItem.from_dict(update_member_asset_access_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


