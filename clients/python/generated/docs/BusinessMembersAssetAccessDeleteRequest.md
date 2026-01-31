# BusinessMembersAssetAccessDeleteRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accesses** | [**List[BusinessMembersAssetAccessDeleteRequestAccessesInner]**](BusinessMembersAssetAccessDeleteRequestAccessesInner.md) | List of members asset access to be deleted | 

## Example

```python
from pinterestsdk.models.business_members_asset_access_delete_request import BusinessMembersAssetAccessDeleteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMembersAssetAccessDeleteRequest from a JSON string
business_members_asset_access_delete_request_instance = BusinessMembersAssetAccessDeleteRequest.from_json(json)
# print the JSON string representation of the object
print(BusinessMembersAssetAccessDeleteRequest.to_json())

# convert the object into a dict
business_members_asset_access_delete_request_dict = business_members_asset_access_delete_request_instance.to_dict()
# create an instance of BusinessMembersAssetAccessDeleteRequest from a dict
business_members_asset_access_delete_request_from_dict = BusinessMembersAssetAccessDeleteRequest.from_dict(business_members_asset_access_delete_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


