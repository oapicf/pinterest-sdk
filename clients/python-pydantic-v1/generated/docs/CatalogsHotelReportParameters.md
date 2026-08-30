# CatalogsHotelReportParameters

Parameters for hotel report

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**report** | [**CatalogsHotelReportParametersReport**](CatalogsHotelReportParametersReport.md) |  | 

## Example

```python
from openapi_client.models.catalogs_hotel_report_parameters import CatalogsHotelReportParameters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelReportParameters from a JSON string
catalogs_hotel_report_parameters_instance = CatalogsHotelReportParameters.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelReportParameters.to_json()

# convert the object into a dict
catalogs_hotel_report_parameters_dict = catalogs_hotel_report_parameters_instance.to_dict()
# create an instance of CatalogsHotelReportParameters from a dict
catalogs_hotel_report_parameters_from_dict = CatalogsHotelReportParameters.from_dict(catalogs_hotel_report_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


