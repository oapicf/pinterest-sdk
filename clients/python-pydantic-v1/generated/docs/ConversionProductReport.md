# ConversionProductReport


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** | Message returned from the create report request | [optional] [readonly] 
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) | Async report status | [optional] [readonly] 
**size** | **float** | Size of the report in bytes | [optional] [readonly] 
**token** | **str** | Token returned from the create report request | [optional] [readonly] 
**url** | **str** | URL of the report | [optional] [readonly] 

## Example

```python
from openapi_client.models.conversion_product_report import ConversionProductReport

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionProductReport from a JSON string
conversion_product_report_instance = ConversionProductReport.from_json(json)
# print the JSON string representation of the object
print ConversionProductReport.to_json()

# convert the object into a dict
conversion_product_report_dict = conversion_product_report_instance.to_dict()
# create an instance of ConversionProductReport from a dict
conversion_product_report_from_dict = ConversionProductReport.from_dict(conversion_product_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


