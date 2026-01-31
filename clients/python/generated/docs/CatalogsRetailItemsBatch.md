# CatalogsRetailItemsBatch

Object describing the catalogs retail items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **str** | Id of the catalogs items batch | [optional] 
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**completed_time** | **datetime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] [readonly] 
**created_time** | **datetime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion. | [readonly] 
**items** | [**List[ItemProcessingRecord]**](ItemProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_retail_items_batch import CatalogsRetailItemsBatch

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailItemsBatch from a JSON string
catalogs_retail_items_batch_instance = CatalogsRetailItemsBatch.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailItemsBatch.to_json())

# convert the object into a dict
catalogs_retail_items_batch_dict = catalogs_retail_items_batch_instance.to_dict()
# create an instance of CatalogsRetailItemsBatch from a dict
catalogs_retail_items_batch_from_dict = CatalogsRetailItemsBatch.from_dict(catalogs_retail_items_batch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


