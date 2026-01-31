# PinterestSdkClient::TemplateResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | ID of the Ad Account that owns the template | [optional] |
| **ad_account_ids** | **Array&lt;String&gt;** | IDs of the Ad Accounts that have access to this template | [optional] |
| **click_window_days** | **Float** | The length of the sliding window over which click conversions will be attributed | [optional] |
| **columns** | **Array&lt;String&gt;** | A list of columns to be included in the report | [optional] |
| **conversion_report_time_type** | **String** | Conversion report time type | [optional] |
| **creation_source** | **String** | The surface used to create this template | [optional] |
| **custom_column_ids** | **Array&lt;String&gt;** | A list of custom column IDs | [optional] |
| **date_range** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] |
| **engagement_window_days** | **Float** | The length of the sliding window over which engagement conversions will be attributed | [optional] |
| **filters_json** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] |
| **granularity** | [**Granularity**](Granularity.md) |  | [optional] |
| **id** | **String** | Template ID | [optional] |
| **ingestion_sources** | **Array&lt;String&gt;** | The filter on the conversion ingestion source method for conversion metrics | [optional] |
| **is_deleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] |
| **is_owned_by_user** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] |
| **is_scheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] |
| **name** | **String** | Template Name | [optional] |
| **report_end_relative_days_in_past** | **Float** | The number of days prior to the day the report will be delivered at which the report will end | [optional] |
| **report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] |
| **report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] |
| **report_start_relative_days_in_past** | **Float** | The number of days prior to the day the report will be delivered at which the report will start | [optional] |
| **type** | **String** | Reporting template type | [optional] |
| **updated_time** | **Float** | Time of last update in seconds since Unix epoch | [optional] |
| **user_id** | **String** | ID of the user who created the template | [optional] |
| **view_window_days** | **Float** | The length of the sliding window over which view conversions will be attributed | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponse.new(
  ad_account_id: 547664674848,
  ad_account_ids: [&quot;547664674848&quot;],
  click_window_days: 7,
  columns: [&quot;SPEND_IN_DOLLAR&quot;],
  conversion_report_time_type: TIME_OF_AD_ACTION,
  creation_source: ADS_MANAGER_REPORT_BUILDER,
  custom_column_ids: [&quot;1597252063&quot;],
  date_range: null,
  engagement_window_days: 7,
  filters_json: [{&quot;field&quot;: &quot;SPEND_IN_DOLLAR&quot;, &quot;operator&quot;: &quot;&#x3D;&quot;, &quot;value&quot;: 100}],
  granularity: null,
  id: 6739202847590,
  ingestion_sources: null,
  is_deleted: false,
  is_owned_by_user: true,
  is_scheduled: true,
  name: Week over week spend,
  report_end_relative_days_in_past: 7,
  report_format: null,
  report_level: null,
  report_start_relative_days_in_past: 7,
  type: BULK,
  updated_time: 1432744744,
  user_id: 784762938748396,
  view_window_days: 7
)
```

