# account_template_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | ID of the Ad Account that owns the template | [optional] [readonly] 
**ad_account_ids** | **list_t \*** | IDs of the Ad Accounts that have access to this template | [optional] 
**ade_columns** | **list_t \*** | A list of ADE columns | [optional] 
**attribution_type** | **any_type_t \*** | Attribution type for Brand/Category/SKU reports | [optional] 
**click_window_days** | **double** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | [**list_t**](reporting_column.md) \* | A list of columns to be included in the report | [optional] 
**conversion_report_time_type** | **conversion_report_time_type_t \*** | Conversion report time type | [optional] 
**creation_source** | **creation_source_t \*** | The surface used to create this template | [optional] 
**custom_column_ids** | **list_t \*** | A list of custom column IDs | [optional] 
**display_metadata** | **char \*** | Additional metadata about this reporting template | [optional] 
**engagement_window_days** | **double** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filters_json** | **char \*** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | **granularity_t \*** |  | [optional] 
**id** | **char \*** | Template ID | [readonly] 
**ingestion_sources** | [**list_t**](ingestion_source.md) \* | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**is_default** | **int** | A boolean representing if this is the default view that loads for this template type | [optional] 
**is_deleted** | **int** | A boolean that indicates if the template has been deleted | [optional] 
**is_owned_by_user** | **int** | A boolean value that indicates if the user owns the template | [optional] 
**is_scheduled** | **int** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **char \*** | Template Name | [optional] 
**report_end_relative_days_in_past** | **double** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**report_format** | **data_output_format_t \*** |  | [optional] 
**report_level** | **metrics_reporting_level_t \*** |  | [optional] 
**report_start_relative_days_in_past** | **double** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**reporting_time_zone** | **reporting_time_zone_t \*** | Timezone for reporting data | [optional] 
**sort_by** | **any_type_t \*** | Unified metric sort configuration | [optional] 
**type** | **char \*** | Type of the template | [optional] 
**updated_time** | **double** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**user_id** | **char \*** | ID of the user who created the template | [optional] 
**view_window_days** | **double** | The length of the sliding window over which view conversions will be attributed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


