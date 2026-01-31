# BusinessMemberAssetsSummaryProfilesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of a business profile. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.business_member_assets_summary_profiles_inner import BusinessMemberAssetsSummaryProfilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMemberAssetsSummaryProfilesInner from a JSON string
business_member_assets_summary_profiles_inner_instance = BusinessMemberAssetsSummaryProfilesInner.from_json(json)
# print the JSON string representation of the object
print(BusinessMemberAssetsSummaryProfilesInner.to_json())

# convert the object into a dict
business_member_assets_summary_profiles_inner_dict = business_member_assets_summary_profiles_inner_instance.to_dict()
# create an instance of BusinessMemberAssetsSummaryProfilesInner from a dict
business_member_assets_summary_profiles_inner_from_dict = BusinessMemberAssetsSummaryProfilesInner.from_dict(business_member_assets_summary_profiles_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


