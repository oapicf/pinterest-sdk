# DeletePartnerAssetAccessBodyAccessesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of the business asset. | 
**partner_id** | **str** | Unique identifier of a business partner to update asset access to. | 
**partner_type** | **str** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional] [default to 'INTERNAL']

## Example

```python
from pinterestsdk.models.delete_partner_asset_access_body_accesses_inner import DeletePartnerAssetAccessBodyAccessesInner

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnerAssetAccessBodyAccessesInner from a JSON string
delete_partner_asset_access_body_accesses_inner_instance = DeletePartnerAssetAccessBodyAccessesInner.from_json(json)
# print the JSON string representation of the object
print(DeletePartnerAssetAccessBodyAccessesInner.to_json())

# convert the object into a dict
delete_partner_asset_access_body_accesses_inner_dict = delete_partner_asset_access_body_accesses_inner_instance.to_dict()
# create an instance of DeletePartnerAssetAccessBodyAccessesInner from a dict
delete_partner_asset_access_body_accesses_inner_from_dict = DeletePartnerAssetAccessBodyAccessesInner.from_dict(delete_partner_asset_access_body_accesses_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


