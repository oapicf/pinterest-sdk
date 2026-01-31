# CatalogsFeedIngestionInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**in_stock** | **int** | The number of ingested products that are in stock. | [optional] 
**out_of_stock** | **int** | The number of ingested products that are in out of stock. | [optional] 
**preorder** | **int** | The number of ingested products that are in preorder. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_feed_ingestion_info import CatalogsFeedIngestionInfo

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedIngestionInfo from a JSON string
catalogs_feed_ingestion_info_instance = CatalogsFeedIngestionInfo.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedIngestionInfo.to_json())

# convert the object into a dict
catalogs_feed_ingestion_info_dict = catalogs_feed_ingestion_info_instance.to_dict()
# create an instance of CatalogsFeedIngestionInfo from a dict
catalogs_feed_ingestion_info_from_dict = CatalogsFeedIngestionInfo.from_dict(catalogs_feed_ingestion_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


