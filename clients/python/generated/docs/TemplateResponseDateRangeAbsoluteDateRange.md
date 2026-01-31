# TemplateResponseDateRangeAbsoluteDateRange

The absolute date range of the template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_date** | **float** | The end date of the date range | [optional] 
**start_date** | **float** | The start date of the date range | [optional] 
**type** | **str** | The date range type | [optional] 

## Example

```python
from pinterestsdk.models.template_response_date_range_absolute_date_range import TemplateResponseDateRangeAbsoluteDateRange

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateResponseDateRangeAbsoluteDateRange from a JSON string
template_response_date_range_absolute_date_range_instance = TemplateResponseDateRangeAbsoluteDateRange.from_json(json)
# print the JSON string representation of the object
print(TemplateResponseDateRangeAbsoluteDateRange.to_json())

# convert the object into a dict
template_response_date_range_absolute_date_range_dict = template_response_date_range_absolute_date_range_instance.to_dict()
# create an instance of TemplateResponseDateRangeAbsoluteDateRange from a dict
template_response_date_range_absolute_date_range_from_dict = TemplateResponseDateRangeAbsoluteDateRange.from_dict(template_response_date_range_absolute_date_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


