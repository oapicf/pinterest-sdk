# InviteAssetsSummaryProfilesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of a business profile. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.invite_assets_summary_profiles_inner import InviteAssetsSummaryProfilesInner

# TODO update the JSON string below
json = "{}"
# create an instance of InviteAssetsSummaryProfilesInner from a JSON string
invite_assets_summary_profiles_inner_instance = InviteAssetsSummaryProfilesInner.from_json(json)
# print the JSON string representation of the object
print(InviteAssetsSummaryProfilesInner.to_json())

# convert the object into a dict
invite_assets_summary_profiles_inner_dict = invite_assets_summary_profiles_inner_instance.to_dict()
# create an instance of InviteAssetsSummaryProfilesInner from a dict
invite_assets_summary_profiles_inner_from_dict = InviteAssetsSummaryProfilesInner.from_dict(invite_assets_summary_profiles_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


