# GetBusinessAssetsResponse

An object containing the permissions a business has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_group_info** | [**AssetGroupBinding**](AssetGroupBinding.md) |  | [optional] 
**asset_id** | **str** | Unique identifier of a business asset. | [optional] 
**asset_type** | **str** | Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. | [optional] 
**catalog_info** | [**GetBusinessAssetsResponseCatalogInfo**](GetBusinessAssetsResponseCatalogInfo.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.get_business_assets_response import GetBusinessAssetsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetBusinessAssetsResponse from a JSON string
get_business_assets_response_instance = GetBusinessAssetsResponse.from_json(json)
# print the JSON string representation of the object
print(GetBusinessAssetsResponse.to_json())

# convert the object into a dict
get_business_assets_response_dict = get_business_assets_response_instance.to_dict()
# create an instance of GetBusinessAssetsResponse from a dict
get_business_assets_response_from_dict = GetBusinessAssetsResponse.from_dict(get_business_assets_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


