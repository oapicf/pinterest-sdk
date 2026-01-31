# CatalogsRetailReportParameters

Parameters for retail report

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**report** | [**CatalogsHotelReportParametersReport**](CatalogsHotelReportParametersReport.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_retail_report_parameters import CatalogsRetailReportParameters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailReportParameters from a JSON string
catalogs_retail_report_parameters_instance = CatalogsRetailReportParameters.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailReportParameters.to_json())

# convert the object into a dict
catalogs_retail_report_parameters_dict = catalogs_retail_report_parameters_instance.to_dict()
# create an instance of CatalogsRetailReportParameters from a dict
catalogs_retail_report_parameters_from_dict = CatalogsRetailReportParameters.from_dict(catalogs_retail_report_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


