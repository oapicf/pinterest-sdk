# BusinessMemberAssetsSummary

Ad accounts and profiles the business member/partner has access to.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_accounts** | [**List[AssetIdWithPermissions]**](AssetIdWithPermissions.md) | List of ad account IDs and respective permission levels. | [optional] 
**profiles** | [**List[AssetIdWithPermissions]**](AssetIdWithPermissions.md) | List of profile IDs and respective permission levels. | [optional] 

## Example

```python
from openapi_client.models.business_member_assets_summary import BusinessMemberAssetsSummary

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessMemberAssetsSummary from a JSON string
business_member_assets_summary_instance = BusinessMemberAssetsSummary.from_json(json)
# print the JSON string representation of the object
print BusinessMemberAssetsSummary.to_json()

# convert the object into a dict
business_member_assets_summary_dict = business_member_assets_summary_instance.to_dict()
# create an instance of BusinessMemberAssetsSummary from a dict
business_member_assets_summary_from_dict = BusinessMemberAssetsSummary.from_dict(business_member_assets_summary_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


