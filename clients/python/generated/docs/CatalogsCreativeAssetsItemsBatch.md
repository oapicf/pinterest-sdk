# CatalogsCreativeAssetsItemsBatch

Object describing the catalogs creative assets items batch

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_id** | **str** | Id of the catalogs items batch | [optional] 
**catalog_type** | **str** |  | 
**completed_time** | **datetime** | Date and time (UTC) of the batch completion: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**created_time** | **datetime** | Date and time (UTC) of the batch creation: YYYY-MM-DD&#39;T&#39;hh:mm:ss | [optional] 
**items** | [**List[CreativeAssetsProcessingRecord]**](CreativeAssetsProcessingRecord.md) | Array with the catalogs items processing records part of the catalogs items batch | [optional] 
**status** | [**BatchOperationStatus**](BatchOperationStatus.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_items_batch import CatalogsCreativeAssetsItemsBatch

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsItemsBatch from a JSON string
catalogs_creative_assets_items_batch_instance = CatalogsCreativeAssetsItemsBatch.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsItemsBatch.to_json())

# convert the object into a dict
catalogs_creative_assets_items_batch_dict = catalogs_creative_assets_items_batch_instance.to_dict()
# create an instance of CatalogsCreativeAssetsItemsBatch from a dict
catalogs_creative_assets_items_batch_from_dict = CatalogsCreativeAssetsItemsBatch.from_dict(catalogs_creative_assets_items_batch_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


