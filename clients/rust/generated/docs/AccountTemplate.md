# AccountTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | ID of the Ad Account that owns the template | [optional][readonly]
**ad_account_ids** | Option<**Vec<String>**> | IDs of the Ad Accounts that have access to this template | [optional]
**ade_columns** | Option<**Vec<String>**> | A list of ADE columns | [optional]
**attribution_type** | Option<**serde_json::Value**> | Attribution type for Brand/Category/SKU reports | [optional]
**click_window_days** | Option<**f64**> | The length of the sliding window over which click conversions will be attributed | [optional]
**columns** | Option<[**Vec<models::ReportingColumn>**](ReportingColumn.md)> | A list of columns to be included in the report | [optional]
**conversion_report_time_type** | Option<[**models::ConversionReportTimeType**](ConversionReportTimeType.md)> | Conversion report time type | [optional]
**creation_source** | Option<[**models::CreationSource**](CreationSource.md)> | The surface used to create this template | [optional]
**custom_column_ids** | Option<**Vec<String>**> | A list of custom column IDs | [optional]
**display_metadata** | Option<**String**> | Additional metadata about this reporting template | [optional]
**engagement_window_days** | Option<**f64**> | The length of the sliding window over which engagement conversions will be attributed | [optional]
**filters_json** | Option<**String**> | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values | [optional]
**granularity** | Option<[**models::Granularity**](Granularity.md)> |  | [optional]
**id** | **String** | Template ID | [readonly]
**ingestion_sources** | Option<[**Vec<models::IngestionSource>**](IngestionSource.md)> | The filter on the conversion ingestion source method for conversion metrics | [optional]
**is_default** | Option<**bool**> | A boolean representing if this is the default view that loads for this template type | [optional]
**is_deleted** | Option<**bool**> | A boolean that indicates if the template has been deleted | [optional]
**is_owned_by_user** | Option<**bool**> | A boolean value that indicates if the user owns the template | [optional]
**is_scheduled** | Option<**bool**> | A boolean value that indicates if this template has been used to create a scheduled report | [optional]
**name** | Option<**String**> | Template Name | [optional]
**report_end_relative_days_in_past** | Option<**f64**> | The number of days prior to the day the report will be delivered at which the report will end | [optional]
**report_format** | Option<[**models::DataOutputFormat**](DataOutputFormat.md)> |  | [optional]
**report_level** | Option<[**models::MetricsReportingLevel**](MetricsReportingLevel.md)> |  | [optional]
**report_start_relative_days_in_past** | Option<**f64**> | The number of days prior to the day the report will be delivered at which the report will start | [optional]
**reporting_time_zone** | Option<[**models::ReportingTimeZone**](ReportingTimeZone.md)> | Timezone for reporting data | [optional]
**sort_by** | Option<**serde_json::Value**> | Unified metric sort configuration | [optional]
**r#type** | Option<**String**> | Type of the template | [optional]
**updated_time** | Option<**f64**> | Time of last update in seconds since Unix epoch | [optional][readonly]
**user_id** | Option<**String**> | ID of the user who created the template | [optional]
**view_window_days** | Option<**f64**> | The length of the sliding window over which view conversions will be attributed | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


