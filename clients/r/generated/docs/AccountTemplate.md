# openapi::AccountTemplate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | ID of the Ad Account that owns the template | [optional] [readonly] 
**ad_account_ids** | **array[character]** | IDs of the Ad Accounts that have access to this template | [optional] 
**ade_columns** | **array[character]** | A list of ADE columns | [optional] 
**attribution_type** | [**AnyType**](.md) | Attribution type for Brand/Category/SKU reports | [optional] 
**click_window_days** | **numeric** | The length of the sliding window over which click conversions will be attributed | [optional] 
**columns** | [**array[ReportingColumn]**](ReportingColumn.md) | A list of columns to be included in the report | [optional] 
**conversion_report_time_type** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] [Enum: ] 
**creation_source** | [**CreationSource**](CreationSource.md) | The surface used to create this template | [optional] [Enum: ] 
**custom_column_ids** | **array[character]** | A list of custom column IDs | [optional] 
**display_metadata** | **character** | Additional metadata about this reporting template | [optional] 
**engagement_window_days** | **numeric** | The length of the sliding window over which engagement conversions will be attributed | [optional] 
**filters_json** | **character** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] 
**granularity** | [**Granularity**](Granularity.md) |  | [optional] [Enum: ] 
**id** | **character** | Template ID | [readonly] 
**ingestion_sources** | [**array[IngestionSource]**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] 
**is_default** | **character** | A boolean representing if this is the default view that loads for this template type | [optional] 
**is_deleted** | **character** | A boolean that indicates if the template has been deleted | [optional] 
**is_owned_by_user** | **character** | A boolean value that indicates if the user owns the template | [optional] 
**is_scheduled** | **character** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] 
**name** | **character** | Template Name | [optional] 
**report_end_relative_days_in_past** | **numeric** | The number of days prior to the day the report will be delivered at which the report will end | [optional] 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [Enum: ] 
**report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] [Enum: ] 
**report_start_relative_days_in_past** | **numeric** | The number of days prior to the day the report will be delivered at which the report will start | [optional] 
**reporting_time_zone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] [Enum: ] 
**sort_by** | [**AnyType**](.md) | Unified metric sort configuration | [optional] 
**type** | **character** | Type of the template | [optional] 
**updated_time** | **numeric** | Time of last update in seconds since Unix epoch | [optional] [readonly] 
**user_id** | **character** | ID of the user who created the template | [optional] 
**view_window_days** | **numeric** | The length of the sliding window over which view conversions will be attributed | [optional] 


