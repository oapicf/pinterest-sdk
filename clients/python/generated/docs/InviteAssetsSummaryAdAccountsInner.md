# InviteAssetsSummaryAdAccountsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of a business ad account. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.invite_assets_summary_ad_accounts_inner import InviteAssetsSummaryAdAccountsInner

# TODO update the JSON string below
json = "{}"
# create an instance of InviteAssetsSummaryAdAccountsInner from a JSON string
invite_assets_summary_ad_accounts_inner_instance = InviteAssetsSummaryAdAccountsInner.from_json(json)
# print the JSON string representation of the object
print(InviteAssetsSummaryAdAccountsInner.to_json())

# convert the object into a dict
invite_assets_summary_ad_accounts_inner_dict = invite_assets_summary_ad_accounts_inner_instance.to_dict()
# create an instance of InviteAssetsSummaryAdAccountsInner from a dict
invite_assets_summary_ad_accounts_inner_from_dict = InviteAssetsSummaryAdAccountsInner.from_dict(invite_assets_summary_ad_accounts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


