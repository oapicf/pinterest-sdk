# BusinessMembersAssetAccessDeleteBody

An object with a list of member asset accesses to delete.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accesses** | [**List[DeleteMemberAssetAccessItem]**](DeleteMemberAssetAccessItem.md) | List of members asset access to be deleted | 

## Example

```python
from openapi_client.models.business_members_asset_access_delete_body import BusinessMembersAssetAccessDeleteBody

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMembersAssetAccessDeleteBody from a JSON string
business_members_asset_access_delete_body_instance = BusinessMembersAssetAccessDeleteBody.from_json(json)
# print the JSON string representation of the object
print BusinessMembersAssetAccessDeleteBody.to_json()

# convert the object into a dict
business_members_asset_access_delete_body_dict = business_members_asset_access_delete_body_instance.to_dict()
# create an instance of BusinessMembersAssetAccessDeleteBody from a dict
business_members_asset_access_delete_body_from_dict = BusinessMembersAssetAccessDeleteBody.from_dict(business_members_asset_access_delete_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


