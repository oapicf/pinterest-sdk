# BusinessMembersAssetAccessDeleteRequestAccessesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Id of the asset on which to remove member permissions. | 
**member_id** | **str** | Unique identifier of the member on which to perform the asset permission removal | 

## Example

```python
from pinterestsdk.models.business_members_asset_access_delete_request_accesses_inner import BusinessMembersAssetAccessDeleteRequestAccessesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMembersAssetAccessDeleteRequestAccessesInner from a JSON string
business_members_asset_access_delete_request_accesses_inner_instance = BusinessMembersAssetAccessDeleteRequestAccessesInner.from_json(json)
# print the JSON string representation of the object
print(BusinessMembersAssetAccessDeleteRequestAccessesInner.to_json())

# convert the object into a dict
business_members_asset_access_delete_request_accesses_inner_dict = business_members_asset_access_delete_request_accesses_inner_instance.to_dict()
# create an instance of BusinessMembersAssetAccessDeleteRequestAccessesInner from a dict
business_members_asset_access_delete_request_accesses_inner_from_dict = BusinessMembersAssetAccessDeleteRequestAccessesInner.from_dict(business_members_asset_access_delete_request_accesses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


