# CatalogsCreativeAssetsBatchRequest

Request object to update catalogs creative assets items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**catalog_type** | **str** |  | 
**country** | [**Country**](Country.md) |  | 
**items** | [**List[CatalogsCreativeAssetsBatchItem]**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | 
**language** | **str** | We recommend using the CatalogsLocale values. | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_batch_request import CatalogsCreativeAssetsBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsBatchRequest from a JSON string
catalogs_creative_assets_batch_request_instance = CatalogsCreativeAssetsBatchRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsBatchRequest.to_json())

# convert the object into a dict
catalogs_creative_assets_batch_request_dict = catalogs_creative_assets_batch_request_instance.to_dict()
# create an instance of CatalogsCreativeAssetsBatchRequest from a dict
catalogs_creative_assets_batch_request_from_dict = CatalogsCreativeAssetsBatchRequest.from_dict(catalogs_creative_assets_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


