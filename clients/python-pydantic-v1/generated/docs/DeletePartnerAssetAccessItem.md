# DeletePartnerAssetAccessItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **str** | Unique identifier of the business asset. | 
**partner_id** | **str** | Unique identifier of a business partner to update asset access to. | 
**partner_type** | **str** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional] [default to 'INTERNAL']

## Example

```python
from openapi_client.models.delete_partner_asset_access_item import DeletePartnerAssetAccessItem

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnerAssetAccessItem from a JSON string
delete_partner_asset_access_item_instance = DeletePartnerAssetAccessItem.from_json(json)
# print the JSON string representation of the object
print DeletePartnerAssetAccessItem.to_json()

# convert the object into a dict
delete_partner_asset_access_item_dict = delete_partner_asset_access_item_instance.to_dict()
# create an instance of DeletePartnerAssetAccessItem from a dict
delete_partner_asset_access_item_from_dict = DeletePartnerAssetAccessItem.from_dict(delete_partner_asset_access_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


