# UpdatePartnerAssetsResult

An object containing the permissions a business partner has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | **str** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**partner_id** | **str** | Unique identifier of a business partner. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.update_partner_assets_result import UpdatePartnerAssetsResult

# TODO update the JSON string below
json = "{}"
# create an instance of UpdatePartnerAssetsResult from a JSON string
update_partner_assets_result_instance = UpdatePartnerAssetsResult.from_json(json)
# print the JSON string representation of the object
print(UpdatePartnerAssetsResult.to_json())

# convert the object into a dict
update_partner_assets_result_dict = update_partner_assets_result_instance.to_dict()
# create an instance of UpdatePartnerAssetsResult from a dict
update_partner_assets_result_from_dict = UpdatePartnerAssetsResult.from_dict(update_partner_assets_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


