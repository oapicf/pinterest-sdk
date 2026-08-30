# CatalogsReportFeedIngestionStats


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | ID of the catalog entity. | [optional] 
**code** | **int** | The event code that a diagnostics aggregated number references | [optional] 
**code_label** | **str** | A human-friendly label for the event code (e.g, &#39;AVAILABILITY_INVALID&#39;) | [optional] 
**message** | **str** | Title message describing the diagnostic issue | [optional] 
**occurrences** | **int** | Number of occurrences of the issue | [optional] 
**report_type** | **str** |  | [optional] 
**severity** | **str** | An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue | [optional] 

## Example

```python
from openapi_client.models.catalogs_report_feed_ingestion_stats import CatalogsReportFeedIngestionStats

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsReportFeedIngestionStats from a JSON string
catalogs_report_feed_ingestion_stats_instance = CatalogsReportFeedIngestionStats.from_json(json)
# print the JSON string representation of the object
print CatalogsReportFeedIngestionStats.to_json()

# convert the object into a dict
catalogs_report_feed_ingestion_stats_dict = catalogs_report_feed_ingestion_stats_instance.to_dict()
# create an instance of CatalogsReportFeedIngestionStats from a dict
catalogs_report_feed_ingestion_stats_from_dict = CatalogsReportFeedIngestionStats.from_dict(catalogs_report_feed_ingestion_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


