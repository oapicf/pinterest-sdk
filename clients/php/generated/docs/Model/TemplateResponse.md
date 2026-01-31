# # TemplateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | ID of the Ad Account that owns the template | [optional]
**ad_account_ids** | **string[]** | IDs of the Ad Accounts that have access to this template | [optional]
**click_window_days** | **float** | The length of the sliding window over which click conversions will be attributed | [optional]
**columns** | **string[]** | A list of columns to be included in the report | [optional]
**conversion_report_time_type** | **string** | Conversion report time type | [optional]
**creation_source** | **string** | The surface used to create this template | [optional]
**custom_column_ids** | **string[]** | A list of custom column IDs | [optional]
**date_range** | [**\OpenAPI\Client\Model\TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional]
**engagement_window_days** | **float** | The length of the sliding window over which engagement conversions will be attributed | [optional]
**filters_json** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional]
**granularity** | [**\OpenAPI\Client\Model\Granularity**](Granularity.md) |  | [optional]
**id** | **string** | Template ID | [optional]
**ingestion_sources** | **string[]** | The filter on the conversion ingestion source method for conversion metrics | [optional]
**is_deleted** | **bool** | A boolean that indicates if the template has been deleted | [optional]
**is_owned_by_user** | **bool** | A boolean value that indicates if the user owns the template | [optional]
**is_scheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional]
**name** | **string** | Template Name | [optional]
**report_end_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will end | [optional]
**report_format** | [**\OpenAPI\Client\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional]
**report_level** | [**\OpenAPI\Client\Model\MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional]
**report_start_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will start | [optional]
**type** | **string** | Reporting template type | [optional]
**updated_time** | **float** | Time of last update in seconds since Unix epoch | [optional]
**user_id** | **string** | ID of the user who created the template | [optional]
**view_window_days** | **float** | The length of the sliding window over which view conversions will be attributed | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
