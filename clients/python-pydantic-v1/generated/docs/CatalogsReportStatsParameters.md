# CatalogsReportStatsParameters

Report stats parameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**report** | [**CatalogsHotelReportStatsParametersReport**](CatalogsHotelReportStatsParametersReport.md) |  | 

## Example

```python
from openapi_client.models.catalogs_report_stats_parameters import CatalogsReportStatsParameters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsReportStatsParameters from a JSON string
catalogs_report_stats_parameters_instance = CatalogsReportStatsParameters.from_json(json)
# print the JSON string representation of the object
print CatalogsReportStatsParameters.to_json()

# convert the object into a dict
catalogs_report_stats_parameters_dict = catalogs_report_stats_parameters_instance.to_dict()
# create an instance of CatalogsReportStatsParameters from a dict
catalogs_report_stats_parameters_from_dict = CatalogsReportStatsParameters.from_dict(catalogs_report_stats_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


