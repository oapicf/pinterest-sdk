# TemplateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Template ID | [optional] [default to None]
**ad_account_id** | **String** | ID of the Ad Account that owns the template | [optional] [default to None]
**ad_account_ids** | **Vec<String>** | IDs of the Ad Accounts that have access to this template | [optional] [default to None]
**user_id** | **String** | ID of the user who created the template | [optional] [default to None]
**name** | **String** | Template Name | [optional] [default to None]
**report_start_relative_days_in_past** | **f64** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to None]
**report_end_relative_days_in_past** | **f64** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to None]
**date_range** | [***models::TemplateResponseDateRange**](TemplateResponse_date_range.md) |  | [optional] [default to None]
**report_level** | [***models::MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [default to None]
**report_format** | [***models::DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to None]
**columns** | **Vec<String>** | A list of columns to be included in the report | [optional] [default to None]
**granularity** | [***models::Granularity**](Granularity.md) |  | [optional] [default to None]
**view_window_days** | **f64** | The length of the sliding window over which view conversions will be attributed | [optional] [default to None]
**click_window_days** | **f64** | The length of the sliding window over which click conversions will be attributed | [optional] [default to None]
**engagement_window_days** | **f64** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to None]
**conversion_report_time_type** | **String** | Conversion report time type | [optional] [default to None]
**filters_json** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values | [optional] [default to None]
**is_owned_by_user** | **bool** | A boolean value that indicates if the user owns the template | [optional] [default to None]
**is_scheduled** | **bool** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to None]
**creation_source** | **String** | The surface used to create this template | [optional] [default to None]
**is_deleted** | **bool** | A boolean that indicates if the template has been deleted | [optional] [default to None]
**updated_time** | **f64** | Time of last update in seconds since Unix epoch | [optional] [default to None]
**custom_column_ids** | **Vec<models::CustomColumnId>** | A list of custom column IDs | [optional] [default to None]
**r#type** | **String** | Reporting template type | [optional] [default to None]
**ingestion_sources** | **Vec<String>** | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


