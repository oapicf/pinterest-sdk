# CatalogsFeedIngestionDetails


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**CatalogsFeedIngestionErrors**](CatalogsFeedIngestionErrors.md) |  | 
**info** | [**CatalogsFeedIngestionInfo**](CatalogsFeedIngestionInfo.md) |  | 
**warnings** | [**CatalogsFeedIngestionWarnings**](CatalogsFeedIngestionWarnings.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_feed_ingestion_details import CatalogsFeedIngestionDetails

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedIngestionDetails from a JSON string
catalogs_feed_ingestion_details_instance = CatalogsFeedIngestionDetails.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedIngestionDetails.to_json())

# convert the object into a dict
catalogs_feed_ingestion_details_dict = catalogs_feed_ingestion_details_instance.to_dict()
# create an instance of CatalogsFeedIngestionDetails from a dict
catalogs_feed_ingestion_details_from_dict = CatalogsFeedIngestionDetails.from_dict(catalogs_feed_ingestion_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


