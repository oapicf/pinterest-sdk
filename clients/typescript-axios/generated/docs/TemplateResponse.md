# TemplateResponse

Template fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | ID of the Ad Account that owns the template | [optional] [default to undefined]
**ad_account_ids** | **Array&lt;string&gt;** | IDs of the Ad Accounts that have access to this template | [optional] [default to undefined]
**click_window_days** | **number** | The length of the sliding window over which click conversions will be attributed | [optional] [default to undefined]
**columns** | **Array&lt;string&gt;** | A list of columns to be included in the report | [optional] [default to undefined]
**conversion_report_time_type** | **string** | Conversion report time type | [optional] [default to undefined]
**creation_source** | **string** | The surface used to create this template | [optional] [default to undefined]
**custom_column_ids** | **Array&lt;string&gt;** | A list of custom column IDs | [optional] [default to undefined]
**date_range** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] [default to undefined]
**engagement_window_days** | **number** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to undefined]
**filters_json** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] [default to undefined]
**granularity** | [**Granularity**](Granularity.md) |  | [optional] [default to undefined]
**id** | **string** | Template ID | [optional] [default to undefined]
**ingestion_sources** | **Array&lt;string&gt;** | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to undefined]
**is_deleted** | **boolean** | A boolean that indicates if the template has been deleted | [optional] [default to undefined]
**is_owned_by_user** | **boolean** | A boolean value that indicates if the user owns the template | [optional] [default to undefined]
**is_scheduled** | **boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to undefined]
**name** | **string** | Template Name | [optional] [default to undefined]
**report_end_relative_days_in_past** | **number** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to undefined]
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to undefined]
**report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [default to undefined]
**report_start_relative_days_in_past** | **number** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to undefined]
**type** | **string** | Reporting template type | [optional] [default to undefined]
**updated_time** | **number** | Time of last update in seconds since Unix epoch | [optional] [default to undefined]
**user_id** | **string** | ID of the user who created the template | [optional] [default to undefined]
**view_window_days** | **number** | The length of the sliding window over which view conversions will be attributed | [optional] [default to undefined]

## Example

```typescript
import { TemplateResponse } from './api';

const instance: TemplateResponse = {
    ad_account_id,
    ad_account_ids,
    click_window_days,
    columns,
    conversion_report_time_type,
    creation_source,
    custom_column_ids,
    date_range,
    engagement_window_days,
    filters_json,
    granularity,
    id,
    ingestion_sources,
    is_deleted,
    is_owned_by_user,
    is_scheduled,
    name,
    report_end_relative_days_in_past,
    report_format,
    report_level,
    report_start_relative_days_in_past,
    type,
    updated_time,
    user_id,
    view_window_days,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
