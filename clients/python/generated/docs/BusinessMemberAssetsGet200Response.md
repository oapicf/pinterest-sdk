# BusinessMemberAssetsGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[AssetIdPermissions]**](AssetIdPermissions.md) | List asset permissions the given member was granted. | 

## Example

```python
from pinterestsdk.models.business_member_assets_get200_response import BusinessMemberAssetsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMemberAssetsGet200Response from a JSON string
business_member_assets_get200_response_instance = BusinessMemberAssetsGet200Response.from_json(json)
# print the JSON string representation of the object
print(BusinessMemberAssetsGet200Response.to_json())

# convert the object into a dict
business_member_assets_get200_response_dict = business_member_assets_get200_response_instance.to_dict()
# create an instance of BusinessMemberAssetsGet200Response from a dict
business_member_assets_get200_response_from_dict = BusinessMemberAssetsGet200Response.from_dict(business_member_assets_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


