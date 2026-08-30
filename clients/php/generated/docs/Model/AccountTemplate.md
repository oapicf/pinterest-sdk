# AccountTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | ID of the Ad Account that owns the template | [optional] [readonly]
**ad_account_ids** | **string[]** | IDs of the Ad Accounts that have access to this template | [optional]
**ade_columns** | **string[]** | A list of ADE columns | [optional]
**attribution_type** | **mixed** | Attribution type for Brand/Category/SKU reports | [optional]
**click_window_days** | **float** | The length of the sliding window over which click conversions will be attributed | [optional]
**columns** | [**\OpenAPI\Client\Model\ReportingColumn[]**](ReportingColumn.md) | A list of columns to be included in the report | [optional]
**conversion_report_time_type** | [**\OpenAPI\Client\Model\ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional]
**creation_source** | [**\OpenAPI\Client\Model\CreationSource**](CreationSource.md) | The surface used to create this template | [optional]
**custom_column_ids** | **string[]** | A list of custom column IDs | [optional]
**display_metadata** | **string** | Additional metadata about this reporting template | [optional]
**engagement_window_days** | **float** | The length of the sliding window over which engagement conversions will be attributed | [optional]
**filters_json** | **string** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional]
**granularity** | [**\OpenAPI\Client\Model\Granularity**](Granularity.md) |  | [optional]
**id** | **string** | Template ID | [readonly]
**ingestion_sources** | [**\OpenAPI\Client\Model\IngestionSource[]**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional]
**is_default** | **bool** | A boolean representing if this is the default view that loads for this template type | [optional]
**is_deleted** | **bool** | A boolean that indicates if the template has been deleted | [optional]
**is_owned_by_user** | **bool** | A boolean value that indicates if the user owns the template | [optional]
**is_scheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional]
**name** | **string** | Template Name | [optional]
**report_end_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will end | [optional]
**report_format** | [**\OpenAPI\Client\Model\DataOutputFormat**](DataOutputFormat.md) |  | [optional]
**report_level** | [**\OpenAPI\Client\Model\MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional]
**report_start_relative_days_in_past** | **float** | The number of days prior to the day the report will be delivered at which the report will start | [optional]
**reporting_time_zone** | [**\OpenAPI\Client\Model\ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional]
**sort_by** | **mixed** | Unified metric sort configuration | [optional]
**type** | **string** | Type of the template | [optional]
**updated_time** | **float** | Time of last update in seconds since Unix epoch | [optional] [readonly]
**user_id** | **string** | ID of the user who created the template | [optional]
**view_window_days** | **float** | The length of the sliding window over which view conversions will be attributed | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
