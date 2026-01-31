# CatalogsReportFeedIngestionFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **str** | ID of the feed entity. | 
**processing_result_id** | **str** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**report_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_report_feed_ingestion_filter import CatalogsReportFeedIngestionFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsReportFeedIngestionFilter from a JSON string
catalogs_report_feed_ingestion_filter_instance = CatalogsReportFeedIngestionFilter.from_json(json)
# print the JSON string representation of the object
print(CatalogsReportFeedIngestionFilter.to_json())

# convert the object into a dict
catalogs_report_feed_ingestion_filter_dict = catalogs_report_feed_ingestion_filter_instance.to_dict()
# create an instance of CatalogsReportFeedIngestionFilter from a dict
catalogs_report_feed_ingestion_filter_from_dict = CatalogsReportFeedIngestionFilter.from_dict(catalogs_report_feed_ingestion_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


