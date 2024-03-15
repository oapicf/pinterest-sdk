# TemplateResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Template ID | [optional]
**ad_account_id** | Option<**String**> | ID of the Ad Account that owns the template | [optional]
**ad_account_ids** | Option<**Vec<String>**> | IDs of the Ad Accounts that have access to this template | [optional]
**user_id** | Option<**String**> | ID of the user who created the template | [optional]
**name** | Option<**String**> | Template Name | [optional]
**report_start_relative_days_in_past** | Option<**f64**> | The number of days prior to the day the report will be delivered at which the report will start | [optional]
**report_end_relative_days_in_past** | Option<**f64**> | The number of days prior to the day the report will be delivered at which the report will end | [optional]
**date_range** | Option<[**models::TemplateResponseDateRange**](TemplateResponse_date_range.md)> |  | [optional]
**report_level** | Option<[**models::MetricsReportingLevel**](MetricsReportingLevel.md)> |  | [optional]
**report_format** | Option<[**models::DataOutputFormat**](DataOutputFormat.md)> |  | [optional]
**columns** | Option<**Vec<String>**> | A list of columns to be included in the report | [optional]
**granularity** | Option<[**models::Granularity**](Granularity.md)> |  | [optional]
**view_window_days** | Option<**f64**> | The length of the sliding window over which view conversions will be attributed | [optional]
**click_window_days** | Option<**f64**> | The length of the sliding window over which click conversions will be attributed | [optional]
**engagement_window_days** | Option<**f64**> | The length of the sliding window over which engagement conversions will be attributed | [optional]
**conversion_report_time_type** | Option<**String**> | Conversion report time type | [optional]
**filters_json** | Option<**String**> | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values | [optional]
**is_owned_by_user** | Option<**bool**> | A boolean value that indicates if the user owns the template | [optional]
**is_scheduled** | Option<**bool**> | A boolean value that indicates if this template has been used to create a scheduled report | [optional]
**creation_source** | Option<**String**> | The surface used to create this template | [optional]
**is_deleted** | Option<**bool**> | A boolean that indicates if the template has been deleted | [optional]
**updated_time** | Option<**f64**> | Time of last update in seconds since Unix epoch | [optional]
**custom_column_ids** | Option<**Vec<String>**> | A list of custom column IDs | [optional]
**r#type** | Option<**String**> | Reporting template type | [optional]
**ingestion_sources** | Option<**Vec<String>**> | The filter on the conversion ingestion source method for conversion metrics | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


