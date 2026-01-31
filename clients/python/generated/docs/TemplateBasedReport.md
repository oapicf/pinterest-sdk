# TemplateBasedReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | 
**template_id** | **str** | Unique identifier of a template. | 
**token** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.template_based_report import TemplateBasedReport

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateBasedReport from a JSON string
template_based_report_instance = TemplateBasedReport.from_json(json)
# print the JSON string representation of the object
print(TemplateBasedReport.to_json())

# convert the object into a dict
template_based_report_dict = template_based_report_instance.to_dict()
# create an instance of TemplateBasedReport from a dict
template_based_report_from_dict = TemplateBasedReport.from_dict(template_based_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


