# CatalogsVerticalBatchRequest

A request object that can have multiple operations on a single batch

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
from pinterestsdk.models.catalogs_vertical_batch_request import CatalogsVerticalBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsVerticalBatchRequest from a JSON string
catalogs_vertical_batch_request_instance = CatalogsVerticalBatchRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsVerticalBatchRequest.to_json())

# convert the object into a dict
catalogs_vertical_batch_request_dict = catalogs_vertical_batch_request_instance.to_dict()
# create an instance of CatalogsVerticalBatchRequest from a dict
catalogs_vertical_batch_request_from_dict = CatalogsVerticalBatchRequest.from_dict(catalogs_vertical_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


