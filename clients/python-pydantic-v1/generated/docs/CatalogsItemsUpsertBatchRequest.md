# CatalogsItemsUpsertBatchRequest

Request object to upsert catalogs items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**items** | [**List[ItemUpsertBatchRecord]**](ItemUpsertBatchRecord.md) | Array with catalogs items | 
**language** | **str** | We recommend using the CatalogsLocale values. | 
**operation** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_items_upsert_batch_request import CatalogsItemsUpsertBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsUpsertBatchRequest from a JSON string
catalogs_items_upsert_batch_request_instance = CatalogsItemsUpsertBatchRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsItemsUpsertBatchRequest.to_json()

# convert the object into a dict
catalogs_items_upsert_batch_request_dict = catalogs_items_upsert_batch_request_instance.to_dict()
# create an instance of CatalogsItemsUpsertBatchRequest from a dict
catalogs_items_upsert_batch_request_from_dict = CatalogsItemsUpsertBatchRequest.from_dict(catalogs_items_upsert_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


