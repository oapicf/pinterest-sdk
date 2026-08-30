# AccountTemplate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | ID of the Ad Account that owns the template | [optional] [readonly] [default to undefined]
**ad_account_ids** | **Array&lt;string&gt;** | IDs of the Ad Accounts that have access to this template | [optional] [default to undefined]
**ade_columns** | **Array&lt;string&gt;** | A list of ADE columns | [optional] [default to undefined]
**attribution_type** | **any** | Attribution type for Brand/Category/SKU reports | [optional] [default to undefined]
**click_window_days** | **number** | The length of the sliding window over which click conversions will be attributed | [optional] [default to undefined]
**columns** | [**Array&lt;ReportingColumn&gt;**](ReportingColumn.md) | A list of columns to be included in the report | [optional] [default to undefined]
**conversion_report_time_type** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] [default to undefined]
**creation_source** | [**CreationSource**](CreationSource.md) | The surface used to create this template | [optional] [default to undefined]
**custom_column_ids** | **Array&lt;string&gt;** | A list of custom column IDs | [optional] [default to undefined]
**display_metadata** | **string** | Additional metadata about this reporting template | [optional] [default to undefined]
**engagement_window_days** | **number** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to undefined]
**filters_json** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] [default to undefined]
**granularity** | [**Granularity**](Granularity.md) |  | [optional] [default to undefined]
**id** | **string** | Template ID | [readonly] [default to undefined]
**ingestion_sources** | [**Array&lt;IngestionSource&gt;**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to undefined]
**is_default** | **boolean** | A boolean representing if this is the default view that loads for this template type | [optional] [default to undefined]
**is_deleted** | **boolean** | A boolean that indicates if the template has been deleted | [optional] [default to undefined]
**is_owned_by_user** | **boolean** | A boolean value that indicates if the user owns the template | [optional] [default to undefined]
**is_scheduled** | **boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to undefined]
**name** | **string** | Template Name | [optional] [default to undefined]
**report_end_relative_days_in_past** | **number** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to undefined]
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to undefined]
**report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [default to undefined]
**report_start_relative_days_in_past** | **number** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to undefined]
**reporting_time_zone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] [default to undefined]
**sort_by** | **any** | Unified metric sort configuration | [optional] [default to undefined]
**type** | **string** | Type of the template | [optional] [default to undefined]
**updated_time** | **number** | Time of last update in seconds since Unix epoch | [optional] [readonly] [default to undefined]
**user_id** | **string** | ID of the user who created the template | [optional] [default to undefined]
**view_window_days** | **number** | The length of the sliding window over which view conversions will be attributed | [optional] [default to undefined]

## Example

```typescript
import { AccountTemplate } from './api';

const instance: AccountTemplate = {
    ad_account_id,
    ad_account_ids,
    ade_columns,
    attribution_type,
    click_window_days,
    columns,
    conversion_report_time_type,
    creation_source,
    custom_column_ids,
    display_metadata,
    engagement_window_days,
    filters_json,
    granularity,
    id,
    ingestion_sources,
    is_default,
    is_deleted,
    is_owned_by_user,
    is_scheduled,
    name,
    report_end_relative_days_in_past,
    report_format,
    report_level,
    report_start_relative_days_in_past,
    reporting_time_zone,
    sort_by,
    type,
    updated_time,
    user_id,
    view_window_days,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
