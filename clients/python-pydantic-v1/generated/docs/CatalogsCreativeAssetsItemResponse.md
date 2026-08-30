# CatalogsCreativeAssetsItemResponse

Object describing a creative assets item record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | [optional] 
**catalog_type** | **str** |  | 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | [optional] 
**item_response_kind** | **str** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | 
**pins** | [**List[Pin]**](Pin.md) | The pins mapped to the item | [optional] 

## Example

```python
from openapi_client.models.catalogs_creative_assets_item_response import CatalogsCreativeAssetsItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsItemResponse from a JSON string
catalogs_creative_assets_item_response_instance = CatalogsCreativeAssetsItemResponse.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsItemResponse.to_json()

# convert the object into a dict
catalogs_creative_assets_item_response_dict = catalogs_creative_assets_item_response_instance.to_dict()
# create an instance of CatalogsCreativeAssetsItemResponse from a dict
catalogs_creative_assets_item_response_from_dict = CatalogsCreativeAssetsItemResponse.from_dict(catalogs_creative_assets_item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


