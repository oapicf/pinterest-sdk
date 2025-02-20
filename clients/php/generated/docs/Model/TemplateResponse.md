# # TemplateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Template ID | [optional]
**ad_account_id** | **string** | ID of the Ad Account that owns the template | [optional]
**ad_account_ids** | **string[]** | IDs of the Ad Accounts that have access to this template | [optional]
**user_id** | **string** | ID of the user who created the template | [optional]
**name** | **string** | Template Name | [optional]
**report_start_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will start | [optional]
**report_end_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will end | [optional]
**date_range** | [**\OpenAPI\Client\Model\TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional]
**report_level** | [**\OpenAPI\Client\Model\MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional]
**report_format** | [**\OpenAPI\Client\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional]
**columns** | **string[]** | A list of columns to be included in the report | [optional]
**granularity** | [**\OpenAPI\Client\Model\Granularity**](Granularity.md) |  | [optional]
**view_window_days** | **float** | The length of the sliding window over which view conversions will be attributed | [optional]
**click_window_days** | **float** | The length of the sliding window over which click conversions will be attributed | [optional]
**engagement_window_days** | **float** | The length of the sliding window over which engagement conversions will be attributed | [optional]
**conversion_report_time_type** | **string** | Conversion report time type | [optional]
**filters_json** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional]
**is_owned_by_user** | **bool** | A boolean value that indicates if the user owns the template | [optional]
**is_scheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional]
**creation_source** | **string** | The surface used to create this template | [optional]
**is_deleted** | **bool** | A boolean that indicates if the template has been deleted | [optional]
**updated_time** | **float** | Time of last update in seconds since Unix epoch | [optional]
**custom_column_ids** | **string[]** | A list of custom column IDs | [optional]
**type** | **string** | Reporting template type | [optional]
**ingestion_sources** | **string[]** | The filter on the conversion ingestion source method for conversion metrics | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
