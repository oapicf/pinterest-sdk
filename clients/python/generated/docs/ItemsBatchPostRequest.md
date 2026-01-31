# ItemsBatchPostRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**catalog_type** | **str** |  | 
**country** | [**Country**](Country.md) |  | 
**items** | [**List[ItemDeleteBatchRecord]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**language** | **str** | We recommend using the CatalogsLocale values. | 
**operation** | [**BatchOperation**](BatchOperation.md) |  | 

## Example

```python
from pinterestsdk.models.items_batch_post_request import ItemsBatchPostRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ItemsBatchPostRequest from a JSON string
items_batch_post_request_instance = ItemsBatchPostRequest.from_json(json)
# print the JSON string representation of the object
print(ItemsBatchPostRequest.to_json())

# convert the object into a dict
items_batch_post_request_dict = items_batch_post_request_instance.to_dict()
# create an instance of ItemsBatchPostRequest from a dict
items_batch_post_request_from_dict = ItemsBatchPostRequest.from_dict(items_batch_post_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


