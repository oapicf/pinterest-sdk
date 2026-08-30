# TemplateBasedReportCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | 
**token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.template_based_report_create import TemplateBasedReportCreate

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateBasedReportCreate from a JSON string
template_based_report_create_instance = TemplateBasedReportCreate.from_json(json)
# print the JSON string representation of the object
print TemplateBasedReportCreate.to_json()

# convert the object into a dict
template_based_report_create_dict = template_based_report_create_instance.to_dict()
# create an instance of TemplateBasedReportCreate from a dict
template_based_report_create_from_dict = TemplateBasedReportCreate.from_dict(template_based_report_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


