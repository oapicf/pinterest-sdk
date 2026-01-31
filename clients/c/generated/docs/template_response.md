# template_response_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | ID of the Ad Account that owns the template | [optional] 
**ad_account_ids** | **list_t \*** | IDs of the Ad Accounts that have access to this template | [optional] 
**click_window_days** | **double** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | **list_t \*** | A list of columns to be included in the report | [optional] 
**conversion_report_time_type** | **pinterest_rest_api_template_response_CONVERSIONREPORTTIMETYPE_e** | Conversion report time type | [optional] 
**creation_source** | **pinterest_rest_api_template_response_CREATIONSOURCE_e** | The surface used to create this template | [optional] 
**custom_column_ids** | **list_t \*** | A list of custom column IDs | [optional] 
**date_range** | [**template_response_date_range_t**](template_response_date_range.md) \* |  | [optional] 
**engagement_window_days** | **double** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filters_json** | **char \*** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | **granularity_t \*** |  | [optional] 
**id** | **char \*** | Template ID | [optional] 
**ingestion_sources** | **list_t \*** | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**is_deleted** | **int** | A boolean that indicates if the template has been deleted | [optional] 
**is_owned_by_user** | **int** | A boolean value that indicates if the user owns the template | [optional] 
**is_scheduled** | **int** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **char \*** | Template Name | [optional] 
**report_end_relative_days_in_past** | **double** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**report_format** | **data_output_format_t \*** |  | [optional] 
**report_level** | **metrics_reporting_level_t \*** |  | [optional] 
**report_start_relative_days_in_past** | **double** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**type** | **pinterest_rest_api_template_response_TYPE_e** | Reporting template type | [optional] 
**updated_time** | **double** | Time of last update in seconds since Unix epoch | [optional] 
**user_id** | **char \*** | ID of the user who created the template | [optional] 
**view_window_days** | **double** | The length of the sliding window over which view conversions will be attributed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


