# DeletePartnerAssetsResult

The terminated asset access.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | **str** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**is_shared_partner** | **bool** | If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset.&lt;br&gt; If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. | [optional] 
**partner_id** | **str** | Unique identifier of a business partner. | [optional] 
**permissions** | **List[str]** | Permission levels member or partner has on an asset. | [optional] 

## Example

```python
from pinterestsdk.models.delete_partner_assets_result import DeletePartnerAssetsResult

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnerAssetsResult from a JSON string
delete_partner_assets_result_instance = DeletePartnerAssetsResult.from_json(json)
# print the JSON string representation of the object
print(DeletePartnerAssetsResult.to_json())

# convert the object into a dict
delete_partner_assets_result_dict = delete_partner_assets_result_instance.to_dict()
# create an instance of DeletePartnerAssetsResult from a dict
delete_partner_assets_result_from_dict = DeletePartnerAssetsResult.from_dict(delete_partner_assets_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


