# openapi::TemplateResponse

Template fields

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | ID of the Ad Account that owns the template | [optional] 
**ad_account_ids** | **array[character]** | IDs of the Ad Accounts that have access to this template | [optional] 
**click_window_days** | **numeric** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | **array[character]** | A list of columns to be included in the report | [optional] [Enum: ] 
**conversion_report_time_type** | **character** | Conversion report time type | [optional] [Enum: [TIME_OF_AD_ACTION, TIME_OF_CONVERSION]] 
**creation_source** | **character** | The surface used to create this template | [optional] [Enum: [ADS_API, ADS_MANAGER_REPORTING_PAGE, ADS_MANAGER_REPORT_BUILDER]] 
**custom_column_ids** | **array[character]** | A list of custom column IDs | [optional] 
**date_range** | [**TemplateResponseDateRange**](TemplateResponse_date_range.md) |  | [optional] 
**engagement_window_days** | **numeric** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filters_json** | **character** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**Granularity**](Granularity.md) |  | [optional] [Enum: ] 
**id** | **character** | Template ID | [optional] 
**ingestion_sources** | **array[character]** | The filter on the conversion ingestion source method for conversion metrics | [optional] [Enum: ] 
**is_deleted** | **character** | A boolean that indicates if the template has been deleted | [optional] 
**is_owned_by_user** | **character** | A boolean value that indicates if the user owns the template | [optional] 
**is_scheduled** | **character** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **character** | Template Name | [optional] 
**report_end_relative_days_in_past** | **numeric** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [Enum: ] 
**report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [Enum: ] 
**report_start_relative_days_in_past** | **numeric** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**type** | **character** | Reporting template type | [optional] [Enum: [UNSPECIFIED, BULK, OVERVIEW, TABLE]] 
**updated_time** | **numeric** | Time of last update in seconds since Unix epoch | [optional] 
**user_id** | **character** | ID of the user who created the template | [optional] 
**view_window_days** | **numeric** | The length of the sliding window over which view conversions will be attributed | [optional] 


