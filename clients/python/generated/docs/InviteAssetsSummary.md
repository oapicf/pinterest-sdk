# InviteAssetsSummary

Ad accounts and profiles the member/partner will be granted access to with this invite/request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_accounts** | [**List[InviteAssetsSummaryAdAccountsInner]**](InviteAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels that will be assigned. | [optional] 
**profiles** | [**List[InviteAssetsSummaryProfilesInner]**](InviteAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels that will be assigned. | [optional] 

## Example

```python
from pinterestsdk.models.invite_assets_summary import InviteAssetsSummary

# TODO update the JSON string below
json = "{}"
# create an instance of InviteAssetsSummary from a JSON string
invite_assets_summary_instance = InviteAssetsSummary.from_json(json)
# print the JSON string representation of the object
print(InviteAssetsSummary.to_json())

# convert the object into a dict
invite_assets_summary_dict = invite_assets_summary_instance.to_dict()
# create an instance of InviteAssetsSummary from a dict
invite_assets_summary_from_dict = InviteAssetsSummary.from_dict(invite_assets_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


