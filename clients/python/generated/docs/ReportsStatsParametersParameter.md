# ReportsStatsParametersParameter

Report stats parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**report** | [**CatalogsHotelReportStatsParametersReport**](CatalogsHotelReportStatsParametersReport.md) |  | 

## Example

```python
from pinterestsdk.models.reports_stats_parameters_parameter import ReportsStatsParametersParameter

# TODO update the JSON string below
json = "{}"
# create an instance of ReportsStatsParametersParameter from a JSON string
reports_stats_parameters_parameter_instance = ReportsStatsParametersParameter.from_json(json)
# print the JSON string representation of the object
print(ReportsStatsParametersParameter.to_json())

# convert the object into a dict
reports_stats_parameters_parameter_dict = reports_stats_parameters_parameter_instance.to_dict()
# create an instance of ReportsStatsParametersParameter from a dict
reports_stats_parameters_parameter_from_dict = ReportsStatsParametersParameter.from_dict(reports_stats_parameters_parameter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


