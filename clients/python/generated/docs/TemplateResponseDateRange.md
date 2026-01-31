# TemplateResponseDateRange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**absolute_date_range** | [**TemplateResponseDateRangeAbsoluteDateRange**](TemplateResponseDateRangeAbsoluteDateRange.md) |  | [optional] 
**dynamic_date_range** | [**TemplateResponseDateRangeDynamicDateRange**](TemplateResponseDateRangeDynamicDateRange.md) |  | [optional] 
**relative_date_range** | [**TemplateResponseDateRangeRelativeDateRange**](TemplateResponseDateRangeRelativeDateRange.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.template_response_date_range import TemplateResponseDateRange

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateResponseDateRange from a JSON string
template_response_date_range_instance = TemplateResponseDateRange.from_json(json)
# print the JSON string representation of the object
print(TemplateResponseDateRange.to_json())

# convert the object into a dict
template_response_date_range_dict = template_response_date_range_instance.to_dict()
# create an instance of TemplateResponseDateRange from a dict
template_response_date_range_from_dict = TemplateResponseDateRange.from_dict(template_response_date_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


