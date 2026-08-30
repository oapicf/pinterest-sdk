# CatalogsFeedProcessingResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | [readonly] 
**id** | **str** | ID of the feed processing result. | 
**ingestion_details** | [**CatalogsFeedIngestionDetails**](CatalogsFeedIngestionDetails.md) |  | 
**product_counts** | [**CatalogsFeedProductCounts**](CatalogsFeedProductCounts.md) |  | 
**status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 
**updated_at** | **datetime** |  | [readonly] 
**validation_details** | [**CatalogsFeedValidationDetails**](CatalogsFeedValidationDetails.md) |  | 
**video_counts** | [**CatalogsFeedVideoCounts**](CatalogsFeedVideoCounts.md) |  | [optional] 

## Example

```python
from openapi_client.models.catalogs_feed_processing_result import CatalogsFeedProcessingResult

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedProcessingResult from a JSON string
catalogs_feed_processing_result_instance = CatalogsFeedProcessingResult.from_json(json)
# print the JSON string representation of the object
print CatalogsFeedProcessingResult.to_json()

# convert the object into a dict
catalogs_feed_processing_result_dict = catalogs_feed_processing_result_instance.to_dict()
# create an instance of CatalogsFeedProcessingResult from a dict
catalogs_feed_processing_result_from_dict = CatalogsFeedProcessingResult.from_dict(catalogs_feed_processing_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


