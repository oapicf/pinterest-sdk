# GetPartnerAssetsResponse

An object containing the permissions a you/your business partner has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | **str** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**permissions** | **List[str]** | The permissions you or your partner has on the asset. If partner_type&#x3D;INTERNAL, the permission levels are for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the permission levels are for the access you have to the partner&#39;s business asset. | [optional] 

## Example

```python
from pinterestsdk.models.get_partner_assets_response import GetPartnerAssetsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPartnerAssetsResponse from a JSON string
get_partner_assets_response_instance = GetPartnerAssetsResponse.from_json(json)
# print the JSON string representation of the object
print(GetPartnerAssetsResponse.to_json())

# convert the object into a dict
get_partner_assets_response_dict = get_partner_assets_response_instance.to_dict()
# create an instance of GetPartnerAssetsResponse from a dict
get_partner_assets_response_from_dict = GetPartnerAssetsResponse.from_dict(get_partner_assets_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


