# BusinessMemberAssetsSummaryAdAccountsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of a business ad account. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.business_member_assets_summary_ad_accounts_inner import BusinessMemberAssetsSummaryAdAccountsInner

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMemberAssetsSummaryAdAccountsInner from a JSON string
business_member_assets_summary_ad_accounts_inner_instance = BusinessMemberAssetsSummaryAdAccountsInner.from_json(json)
# print the JSON string representation of the object
print(BusinessMemberAssetsSummaryAdAccountsInner.to_json())

# convert the object into a dict
business_member_assets_summary_ad_accounts_inner_dict = business_member_assets_summary_ad_accounts_inner_instance.to_dict()
# create an instance of BusinessMemberAssetsSummaryAdAccountsInner from a dict
business_member_assets_summary_ad_accounts_inner_from_dict = BusinessMemberAssetsSummaryAdAccountsInner.from_dict(business_member_assets_summary_ad_accounts_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


