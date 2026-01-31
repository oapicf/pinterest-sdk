# TemplateResponseDateRangeRelativeDateRange

The relative date range of the template

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end_days_in_past** | **float** | The end date of the date range | [optional] 
**start_days_in_past** | **float** | The start date of the date range | [optional] 
**type** | **str** | The date range type | [optional] 

## Example

```python
from pinterestsdk.models.template_response_date_range_relative_date_range import TemplateResponseDateRangeRelativeDateRange

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateResponseDateRangeRelativeDateRange from a JSON string
template_response_date_range_relative_date_range_instance = TemplateResponseDateRangeRelativeDateRange.from_json(json)
# print the JSON string representation of the object
print(TemplateResponseDateRangeRelativeDateRange.to_json())

# convert the object into a dict
template_response_date_range_relative_date_range_dict = template_response_date_range_relative_date_range_instance.to_dict()
# create an instance of TemplateResponseDateRangeRelativeDateRange from a dict
template_response_date_range_relative_date_range_from_dict = TemplateResponseDateRangeRelativeDateRange.from_dict(template_response_date_range_relative_date_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


