# CatalogsItemsUpdateBatchRequest

Request object to update catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**items** | [**List[ItemUpdateBatchRecord]**](ItemUpdateBatchRecord.md) | Array with catalogs items | 
**language** | **str** | We recommend using the CatalogsLocale values. | 
**operation** | [**BatchOperation**](BatchOperation.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_items_update_batch_request import CatalogsItemsUpdateBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsUpdateBatchRequest from a JSON string
catalogs_items_update_batch_request_instance = CatalogsItemsUpdateBatchRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsItemsUpdateBatchRequest.to_json())

# convert the object into a dict
catalogs_items_update_batch_request_dict = catalogs_items_update_batch_request_instance.to_dict()
# create an instance of CatalogsItemsUpdateBatchRequest from a dict
catalogs_items_update_batch_request_from_dict = CatalogsItemsUpdateBatchRequest.from_dict(catalogs_items_update_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


