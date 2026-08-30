# CatalogsRetailBatchRequest

A request object that can have multiple operations on a single retail batch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 
**catalog_type** | **str** |  | 
**country** | [**Country**](Country.md) |  | 
**items** | [**List[CatalogsRetailBatchRequestItemsItems]**](CatalogsRetailBatchRequestItemsItems.md) | Array with catalogs item operations | 
**language** | **str** | We recommend using the CatalogsLocale values. | 

## Example

```python
from openapi_client.models.catalogs_retail_batch_request import CatalogsRetailBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailBatchRequest from a JSON string
catalogs_retail_batch_request_instance = CatalogsRetailBatchRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsRetailBatchRequest.to_json()

# convert the object into a dict
catalogs_retail_batch_request_dict = catalogs_retail_batch_request_instance.to_dict()
# create an instance of CatalogsRetailBatchRequest from a dict
catalogs_retail_batch_request_from_dict = CatalogsRetailBatchRequest.from_dict(catalogs_retail_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


