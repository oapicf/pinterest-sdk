# CatalogsItemsBatch

Object describing the catalogs items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **str** | Id of the catalogs items batch | [optional] 
**catalog_type** | **str** |  | 
**completed_time** | **datetime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**created_time** | **datetime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | 
**items** | [**List[CreativeAssetsProcessingRecord]**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_items_batch import CatalogsItemsBatch

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsBatch from a JSON string
catalogs_items_batch_instance = CatalogsItemsBatch.from_json(json)
# print the JSON string representation of the object
print(CatalogsItemsBatch.to_json())

# convert the object into a dict
catalogs_items_batch_dict = catalogs_items_batch_instance.to_dict()
# create an instance of CatalogsItemsBatch from a dict
catalogs_items_batch_from_dict = CatalogsItemsBatch.from_dict(catalogs_items_batch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


