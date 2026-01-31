# UpdateMemberAssetAccessBodyAccessesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Id of the asset to update. | 
**member_id** | **str** | Unique identifier of the member on which to perform the update | 
**permissions** | [**List[Permissions]**](Permissions.md) | A non-empty array of permissions to assign to the member. | 

## Example

```python
from pinterestsdk.models.update_member_asset_access_body_accesses_inner import UpdateMemberAssetAccessBodyAccessesInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMemberAssetAccessBodyAccessesInner from a JSON string
update_member_asset_access_body_accesses_inner_instance = UpdateMemberAssetAccessBodyAccessesInner.from_json(json)
# print the JSON string representation of the object
print(UpdateMemberAssetAccessBodyAccessesInner.to_json())

# convert the object into a dict
update_member_asset_access_body_accesses_inner_dict = update_member_asset_access_body_accesses_inner_instance.to_dict()
# create an instance of UpdateMemberAssetAccessBodyAccessesInner from a dict
update_member_asset_access_body_accesses_inner_from_dict = UpdateMemberAssetAccessBodyAccessesInner.from_dict(update_member_asset_access_body_accesses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


