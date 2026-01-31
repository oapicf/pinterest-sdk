# UpdatePartnerAssetAccessBodyAccessesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of the business asset. | 
**partner_id** | **str** | Unique identifier of a business partner to update asset access to. | 
**permissions** | [**List[Permissions]**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 

## Example

```python
from pinterestsdk.models.update_partner_asset_access_body_accesses_inner import UpdatePartnerAssetAccessBodyAccessesInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerAssetAccessBodyAccessesInner from a JSON string
update_partner_asset_access_body_accesses_inner_instance = UpdatePartnerAssetAccessBodyAccessesInner.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerAssetAccessBodyAccessesInner.to_json())

# convert the object into a dict
update_partner_asset_access_body_accesses_inner_dict = update_partner_asset_access_body_accesses_inner_instance.to_dict()
# create an instance of UpdatePartnerAssetAccessBodyAccessesInner from a dict
update_partner_asset_access_body_accesses_inner_from_dict = UpdatePartnerAssetAccessBodyAccessesInner.from_dict(update_partner_asset_access_body_accesses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


