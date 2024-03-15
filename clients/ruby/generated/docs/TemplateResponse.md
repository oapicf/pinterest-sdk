# PinterestSdkClient::TemplateResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Template ID | [optional] |
| **ad_account_id** | **String** | ID of the Ad Account that owns the template | [optional] |
| **ad_account_ids** | **Array&lt;String&gt;** | IDs of the Ad Accounts that have access to this template | [optional] |
| **user_id** | **String** | ID of the user who created the template | [optional] |
| **name** | **String** | Template Name | [optional] |
| **report_start_relative_days_in_past** | **Float** | The number of days prior to the day the report will be delivered at which the report will start | [optional] |
| **report_end_relative_days_in_past** | **Float** | The number of days prior to the day the report will be delivered at which the report will end | [optional] |
| **date_range** | [**TemplateResponseDateRange**](TemplateResponseDateRange.md) |  | [optional] |
| **report_level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [optional] |
| **report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] |
| **columns** | **Array&lt;String&gt;** | A list of columns to be included in the report | [optional] |
| **granularity** | [**Granularity**](Granularity.md) |  | [optional] |
| **view_window_days** | **Float** | The length of the sliding window over which view conversions will be attributed | [optional] |
| **click_window_days** | **Float** | The length of the sliding window over which click conversions will be attributed | [optional] |
| **engagement_window_days** | **Float** | The length of the sliding window over which engagement conversions will be attributed | [optional] |
| **conversion_report_time_type** | **String** | Conversion report time type | [optional] |
| **filters_json** | **String** | A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:&lt;br&gt; \&quot;field\&quot;: The column name&lt;br&gt; \&quot;operator\&quot;: The operator. Allowed operators: [\&quot;&#x3D;\&quot;, \&quot;!&#x3D;\&quot;, \&quot;in\&quot;, \&quot;not_in\&quot;, \&quot;~\&quot;, \&quot;&gt;\&quot;, \&quot;&lt;\&quot;, \&quot;contains_substring\&quot;]&lt;br&gt; \&quot;value\&quot;: A single value or a list of values | [optional] |
| **is_owned_by_user** | **Boolean** | A boolean value that indicates if the user owns the template | [optional] |
| **is_scheduled** | **Boolean** | A boolean value that indicates if this template has been used to create a scheduled report | [optional] |
| **creation_source** | **String** | The surface used to create this template | [optional] |
| **is_deleted** | **Boolean** | A boolean that indicates if the template has been deleted | [optional] |
| **updated_time** | **Float** | Time of last update in seconds since Unix epoch | [optional] |
| **custom_column_ids** | **Array&lt;String&gt;** | A list of custom column IDs | [optional] |
| **type** | **String** | Reporting template type | [optional] |
| **ingestion_sources** | **Array&lt;String&gt;** | The filter on the conversion ingestion source method for conversion metrics | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::TemplateResponse.new(
  id: 6739202847590,
  ad_account_id: 547664674848,
  ad_account_ids: [&quot;547664674848&quot;],
  user_id: 784762938748396,
  name: Week over week spend,
  report_start_relative_days_in_past: 7,
  report_end_relative_days_in_past: 7,
  date_range: null,
  report_level: null,
  report_format: null,
  columns: [&quot;SPEND_IN_DOLLAR&quot;],
  granularity: null,
  view_window_days: 7,
  click_window_days: 7,
  engagement_window_days: 7,
  conversion_report_time_type: TIME_OF_AD_ACTION,
  filters_json: [{&quot;field&quot;: &quot;SPEND_IN_DOLLAR&quot;, &quot;operator&quot;: &quot;&#x3D;&quot;, &quot;value&quot;: 100}],
  is_owned_by_user: true,
  is_scheduled: true,
  creation_source: ADS_MANAGER_REPORT_BUILDER,
  is_deleted: false,
  updated_time: 1432744744,
  custom_column_ids: [&quot;1597252063&quot;],
  type: BULK,
  ingestion_sources: null
)
```

