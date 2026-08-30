# CatalogsItemsBatchPostRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**catalog_type** | **str** |  | 
**country** | [**Country**](Country.md) |  | 
**items** | [**List[ItemDeleteBatchRecord]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**language** | **str** | We recommend using the CatalogsLocale values. | 
**operation** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_items_batch_post_request import CatalogsItemsBatchPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsBatchPostRequest from a JSON string
catalogs_items_batch_post_request_instance = CatalogsItemsBatchPostRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsItemsBatchPostRequest.to_json()

# convert the object into a dict
catalogs_items_batch_post_request_dict = catalogs_items_batch_post_request_instance.to_dict()
# create an instance of CatalogsItemsBatchPostRequest from a dict
catalogs_items_batch_post_request_from_dict = CatalogsItemsBatchPostRequest.from_dict(catalogs_items_batch_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


