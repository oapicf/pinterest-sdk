# CatalogsFeedIngestion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**feed_id** | **str** |  | 
**id** | **str** |  | 
**status** | [**CatalogsFeedProcessingStatus**](CatalogsFeedProcessingStatus.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_feed_ingestion import CatalogsFeedIngestion

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedIngestion from a JSON string
catalogs_feed_ingestion_instance = CatalogsFeedIngestion.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedIngestion.to_json())

# convert the object into a dict
catalogs_feed_ingestion_dict = catalogs_feed_ingestion_instance.to_dict()
# create an instance of CatalogsFeedIngestion from a dict
catalogs_feed_ingestion_from_dict = CatalogsFeedIngestion.from_dict(catalogs_feed_ingestion_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


