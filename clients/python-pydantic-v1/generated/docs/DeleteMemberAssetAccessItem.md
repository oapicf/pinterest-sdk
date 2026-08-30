# DeleteMemberAssetAccessItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Id of the asset on which to remove member permissions. | 
**member_id** | **str** | Unique identifier of the member on which to perform the asset permission removal | 

## Example

```python
from openapi_client.models.delete_member_asset_access_item import DeleteMemberAssetAccessItem

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteMemberAssetAccessItem from a JSON string
delete_member_asset_access_item_instance = DeleteMemberAssetAccessItem.from_json(json)
# print the JSON string representation of the object
print DeleteMemberAssetAccessItem.to_json()

# convert the object into a dict
delete_member_asset_access_item_dict = delete_member_asset_access_item_instance.to_dict()
# create an instance of DeleteMemberAssetAccessItem from a dict
delete_member_asset_access_item_from_dict = DeleteMemberAssetAccessItem.from_dict(delete_member_asset_access_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


