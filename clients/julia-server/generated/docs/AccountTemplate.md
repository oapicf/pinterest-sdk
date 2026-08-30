# AccountTemplate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`ad_account_id`** | **`String`** | ID of the Ad Account that owns the template | [optional] [readonly] [default to nothing]
**`ad_account_ids`** | **`Vector{String}`** | IDs of the Ad Accounts that have access to this template | [optional] [default to nothing]
**`ade_columns`** | **`Vector{String}`** | A list of ADE columns | [optional] [default to nothing]
**`attribution_type`** | **`Any`** | Attribution type for Brand/Category/SKU reports | [optional] [default to nothing]
**`click_window_days`** | **`Float64`** | The length of the sliding window over which click conversions will be attributed | [optional] [default to nothing]
**`columns`** | [**`Vector{ReportingColumn}`**](ReportingColumn.md) | A list of columns to be included in the report | [optional] [default to nothing]
**`conversion_report_time_type`** | [**`*ConversionReportTimeType`**](ConversionReportTimeType.md) | Conversion report time type | [optional] [default to nothing]
**`creation_source`** | [**`*CreationSource`**](CreationSource.md) | The surface used to create this template | [optional] [default to nothing]
**`custom_column_ids`** | **`Vector{String}`** | A list of custom column IDs | [optional] [default to nothing]
**`display_metadata`** | **`String`** | Additional metadata about this reporting template | [optional] [default to nothing]
**`engagement_window_days`** | **`Float64`** | The length of the sliding window over which engagement conversions will be attributed | [optional] [default to nothing]
**`filters_json`** | **`String`** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] [default to nothing]
**`granularity`** | [**`*Granularity`**](Granularity.md) |  | [optional] [default to nothing]
**`id`** | **`String`** | Template ID | [readonly] [default to nothing]
**`ingestion_sources`** | [**`Vector{IngestionSource}`**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] [default to nothing]
**`is_default`** | **`Bool`** | A boolean representing if this is the default view that loads for this template type | [optional] [default to nothing]
**`is_deleted`** | **`Bool`** | A boolean that indicates if the template has been deleted | [optional] [default to nothing]
**`is_owned_by_user`** | **`Bool`** | A boolean value that indicates if the user owns the template | [optional] [default to nothing]
**`is_scheduled`** | **`Bool`** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] [default to nothing]
**`name`** | **`String`** | Template Name | [optional] [default to nothing]
**`report_end_relative_days_in_past`** | **`Float64`** | The number of days prior to the day the report will be delivered at which the report will end | [optional] [default to nothing]
**`report_format`** | [**`*DataOutputFormat`**](DataOutputFormat.md) |  | [optional] [default to nothing]
**`report_level`** | [**`*MetricsReportingLevel`**](MetricsReportingLevel.md) |  | [optional] [default to nothing]
**`report_start_relative_days_in_past`** | **`Float64`** | The number of days prior to the day the report will be delivered at which the report will start | [optional] [default to nothing]
**`reporting_time_zone`** | [**`*ReportingTimeZone`**](ReportingTimeZone.md) | Timezone for reporting data | [optional] [default to nothing]
**`sort_by`** | **`Any`** | Unified metric sort configuration | [optional] [default to nothing]
**`type`** | **`String`** | Type of the template | [optional] [default to nothing]
**`updated_time`** | **`Float64`** | Time of last update in seconds since Unix epoch | [optional] [readonly] [default to nothing]
**`user_id`** | **`String`** | ID of the user who created the template | [optional] [default to nothing]
**`view_window_days`** | **`Float64`** | The length of the sliding window over which view conversions will be attributed | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


