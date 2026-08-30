# UpdateMemberAssetAccessBody

An object with a list of all the new member asset accesses.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accesses** | [**List[UpdateMemberAssetAccessItem]**](UpdateMemberAssetAccessItem.md) | List of member asset accesses to assign or update. | 

## Example

```python
from pinterestsdk.models.update_member_asset_access_body import UpdateMemberAssetAccessBody

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMemberAssetAccessBody from a JSON string
update_member_asset_access_body_instance = UpdateMemberAssetAccessBody.from_json(json)
# print the JSON string representation of the object
print(UpdateMemberAssetAccessBody.to_json())

# convert the object into a dict
update_member_asset_access_body_dict = update_member_asset_access_body_instance.to_dict()
# create an instance of UpdateMemberAssetAccessBody from a dict
update_member_asset_access_body_from_dict = UpdateMemberAssetAccessBody.from_dict(update_member_asset_access_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


