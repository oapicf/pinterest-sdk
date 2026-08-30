# CatalogsHotelReportParametersReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **str** | ID of the feed entity. | 
**processing_result_id** | **str** | Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. | [optional] 
**report_type** | **str** |  | 
**catalog_id** | **str** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_hotel_report_parameters_report import CatalogsHotelReportParametersReport

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelReportParametersReport from a JSON string
catalogs_hotel_report_parameters_report_instance = CatalogsHotelReportParametersReport.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelReportParametersReport.to_json())

# convert the object into a dict
catalogs_hotel_report_parameters_report_dict = catalogs_hotel_report_parameters_report_instance.to_dict()
# create an instance of CatalogsHotelReportParametersReport from a dict
catalogs_hotel_report_parameters_report_from_dict = CatalogsHotelReportParametersReport.from_dict(catalogs_hotel_report_parameters_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


