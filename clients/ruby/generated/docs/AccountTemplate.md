# PinterestSdkClient::AccountTemplate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | ID of the Ad Account that owns the template | [optional][readonly] |
| **ad_account_ids** | **Array&lt;String&gt;** | IDs of the Ad Accounts that have access to this template | [optional] |
| **ade_columns** | **Array&lt;String&gt;** | A list of ADE columns | [optional] |
| **attribution_type** | **Object** | Attribution type for Brand/Category/SKU reports | [optional] |
| **click_window_days** | **Float** | The length of the sliding window over which click conversions will be attributed | [optional] |
| **columns** | [**Array&lt;ReportingColumn&gt;**](ReportingColumn.md) | A list of columns to be included in the report | [optional] |
| **conversion_report_time_type** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Conversion report time type | [optional] |
| **creation_source** | [**CreationSource**](CreationSource.md) | The surface used to create this template | [optional] |
| **custom_column_ids** | **Array&lt;String&gt;** | A list of custom column IDs | [optional] |
| **display_metadata** | **String** | Additional metadata about this reporting template | [optional] |
| **engagement_window_days** | **Float** | The length of the sliding window over which engagement conversions will be attributed | [optional] |
| **filters_json** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \&quot;field\&quot;: The column name\\ \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]\\ \&quot;value\&quot;: A single value or a list of values | [optional] |
| **granularity** | [**Granularity**](Granularity.md) |  | [optional] |
| **id** | **String** | Template ID | [readonly] |
| **ingestion_sources** | [**Array&lt;IngestionSource&gt;**](IngestionSource.md) | The filter on the conversion ingestion source method for conversion metrics | [optional] |
| **is_default** | **Boolean** | A boolean representing if this is the default view that loads for this template type | [optional] |
| **is_deleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] |
| **is_owned_by_user** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] |
| **is_scheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] |
| **name** | **String** | Template Name | [optional] |
| **report_end_relative_days_in_past** | **Float** | The number of days prior to the day the report will be delivered at which the report will end | [optional] |
| **report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] |
| **report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] |
| **report_start_relative_days_in_past** | **Float** | The number of days prior to the day the report will be delivered at which the report will start | [optional] |
| **reporting_time_zone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Timezone for reporting data | [optional] |
| **sort_by** | **Object** | Unified metric sort configuration | [optional] |
| **type** | **String** | Type of the template | [optional] |
| **updated_time** | **Float** | Time of last update in seconds since Unix epoch | [optional][readonly] |
| **user_id** | **String** | ID of the user who created the template | [optional] |
| **view_window_days** | **Float** | The length of the sliding window over which view conversions will be attributed | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AccountTemplate.new(
  ad_account_id: null,
  ad_account_ids: null,
  ade_columns: [&quot;ADE_COST_PER_ACTION-download_picture&quot;],
  attribution_type: ADVERTISER_LEVEL,
  click_window_days: null,
  columns: null,
  conversion_report_time_type: null,
  creation_source: null,
  custom_column_ids: null,
  display_metadata: null,
  engagement_window_days: null,
  filters_json: null,
  granularity: null,
  id: null,
  ingestion_sources: null,
  is_default: false,
  is_deleted: null,
  is_owned_by_user: null,
  is_scheduled: null,
  name: null,
  report_end_relative_days_in_past: null,
  report_format: null,
  report_level: null,
  report_start_relative_days_in_past: null,
  reporting_time_zone: null,
  sort_by: null,
  type: null,
  updated_time: null,
  user_id: null,
  view_window_days: null
)
```

