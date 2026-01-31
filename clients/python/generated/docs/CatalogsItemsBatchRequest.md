# CatalogsItemsBatchRequest

Request object of catalogs items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**items** | [**List[ItemDeleteBatchRecord]**](ItemDeleteBatchRecord.md) | Array with catalogs items | 
**language** | **str** | We recommend using the CatalogsLocale values. | 
**operation** | [**BatchOperation**](BatchOperation.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_items_batch_request import CatalogsItemsBatchRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsBatchRequest from a JSON string
catalogs_items_batch_request_instance = CatalogsItemsBatchRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsItemsBatchRequest.to_json())

# convert the object into a dict
catalogs_items_batch_request_dict = catalogs_items_batch_request_instance.to_dict()
# create an instance of CatalogsItemsBatchRequest from a dict
catalogs_items_batch_request_from_dict = CatalogsItemsBatchRequest.from_dict(catalogs_items_batch_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


