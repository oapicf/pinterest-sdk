# ACCOUNT_TEMPLATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | ID of the Ad Account that owns the template | [optional] [readonly] [default to null]
**ad_account_ids** | [**LIST [STRING_32]**](STRING_32.md) | IDs of the Ad Accounts that have access to this template | [optional] [default to null]
**ade_columns** | [**LIST [STRING_32]**](STRING_32.md) | A list of ADE columns | [optional] [default to null]
**attribution_type** | [**ANY**](.md) | Attribution type for Brand/Category/SKU reports | [optional] [default to null]
**click_window_days** | **REAL_32** | The length of the sliding window over which click conversions will be attributed | [optional] [default to null]
**columns** | [**LIST [REPORTING_COLUMN]**](ReportingColumn.md) | A list of columns to be included in the report | [optional] [default to null]
**conversion_report_time_type** | [**CONVERSION_REPORT_TIME_TYPE**](ConversionReportTimeType.md) | Conversion report time type | [optional] [default to null]
**creation_source** | [**CREATION_SOURCE**](CreationSource.md) | The surface used to create this template | [optional] [default to null]
**custom_column_ids** | [**LIST [STRING_32]**](STRING_32.md) | A list of custom column IDs | [optional] [default to null]
**display_metadata** | [**STRING_32**](STRING_32.md) | Additional metadata about this reporting template | [optional] [default to null]
**engagement_window_days** | **REAL_32** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to null]
**filters_json** | [**STRING_32**](STRING_32.md) | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] [default to null]
**granularity** | [**GRANULARITY**](Granularity.md) |  | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Template ID | [readonly] [default to null]
**ingestion_sources** | [**LIST [INGESTION_SOURCE]**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to null]
**is_default** | **BOOLEAN** | A boolean representing if this is the default view that loads for this template type | [optional] [default to null]
**is_deleted** | **BOOLEAN** | A boolean that indicates if the template has been deleted | [optional] [default to null]
**is_owned_by_user** | **BOOLEAN** | A boolean value that indicates if the user owns the template | [optional] [default to null]
**is_scheduled** | **BOOLEAN** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Template Name | [optional] [default to null]
**report_end_relative_days_in_past** | **REAL_32** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to null]
**report_format** | [**DATA_OUTPUT_FORMAT**](DataOutputFormat.md) |  | [optional] [default to null]
**report_level** | [**METRICS_REPORTING_LEVEL**](MetricsReportingLevel.md) |  | [optional] [default to null]
**report_start_relative_days_in_past** | **REAL_32** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to null]
**reporting_time_zone** | [**REPORTING_TIME_ZONE**](ReportingTimeZone.md) | Timezone for reporting data | [optional] [default to null]
**sort_by** | [**ANY**](.md) | Unified metric sort configuration | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Type of the template | [optional] [default to null]
**updated_time** | **REAL_32** | Time of last update in seconds since Unix epoch | [optional] [readonly] [default to null]
**user_id** | [**STRING_32**](STRING_32.md) | ID of the user who created the template | [optional] [default to null]
**view_window_days** | **REAL_32** | The length of the sliding window over which view conversions will be attributed | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


