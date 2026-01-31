# TemplateResponse

Template fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | ID of the Ad Account that owns the template | [optional] 
**ad_account_ids** | **List[str]** | IDs of the Ad Accounts that have access to this template | [optional] 
**click_window_days** | **float** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | **List[str]** | A list of columns to be included in the report | [optional] 
**conversion_report_time_type** | **str** | Conversion report time type | [optional] 
**creation_source** | **str** | The surface used to create this template | [optional] 
**custom_column_ids** | **List[str]** | A list of custom column IDs | [optional] 
**date_range** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] 
**engagement_window_days** | **float** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filters_json** | **str** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**Granularity**](Granularity.md) |  | [optional] 
**id** | **str** | Template ID | [optional] 
**ingestion_sources** | **List[str]** | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**is_deleted** | **bool** | A boolean that indicates if the template has been deleted | [optional] 
**is_owned_by_user** | **bool** | A boolean value that indicates if the user owns the template | [optional] 
**is_scheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **str** | Template Name | [optional] 
**report_end_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] 
**report_start_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**type** | **str** | Reporting template type | [optional] 
**updated_time** | **float** | Time of last update in seconds since Unix epoch | [optional] 
**user_id** | **str** | ID of the user who created the template | [optional] 
**view_window_days** | **float** | The length of the sliding window over which view conversions will be attributed | [optional] 

## Example

```python
from pinterestsdk.models.template_response import TemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TemplateResponse from a JSON string
template_response_instance = TemplateResponse.from_json(json)
# print the JSON string representation of the object
print(TemplateResponse.to_json())

# convert the object into a dict
template_response_dict = template_response_instance.to_dict()
# create an instance of TemplateResponse from a dict
template_response_from_dict = TemplateResponse.from_dict(template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


