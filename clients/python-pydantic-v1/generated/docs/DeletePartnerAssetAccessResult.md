# DeletePartnerAssetAccessResult

The terminated asset access.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | **str** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**is_shared_partner** | **bool** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**partner_id** | **str** | Unique identifier of a business partner. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from openapi_client.models.delete_partner_asset_access_result import DeletePartnerAssetAccessResult

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnerAssetAccessResult from a JSON string
delete_partner_asset_access_result_instance = DeletePartnerAssetAccessResult.from_json(json)
# print the JSON string representation of the object
print DeletePartnerAssetAccessResult.to_json()

# convert the object into a dict
delete_partner_asset_access_result_dict = delete_partner_asset_access_result_instance.to_dict()
# create an instance of DeletePartnerAssetAccessResult from a dict
delete_partner_asset_access_result_from_dict = DeletePartnerAssetAccessResult.from_dict(delete_partner_asset_access_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


