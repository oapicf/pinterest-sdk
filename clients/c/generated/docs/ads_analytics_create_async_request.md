# ads_analytics_create_async_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **list_t \*** | List of ad group ids | [optional] 
**ad_group_statuses** | [**list_t**](ad_group_summary_status.md) \* | List of values for filtering | [optional] 
**ad_ids** | **list_t \*** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] 
**ad_statuses** | [**list_t**](pin_promotion_summary_status.md) \* | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] 
**attribution_types** | [**list_t**](conversion_report_attribution_type.md) \* | List of attribution types for the conversion report. | [optional] 
**campaign_brand_label** | **char \*** | Campaign brand label for filtering. | [optional] 
**campaign_custom_label** | **char \*** | Campaign custom label for filtering. | [optional] 
**campaign_ids** | **list_t \*** | List of campaign ids | [optional] 
**campaign_objective_types** | [**list_t**](campaign_objective_type.md) \* | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] 
**campaign_statuses** | [**list_t**](campaign_summary_status.md) \* | List of status values for filtering | [optional] 
**click_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**columns** | [**list_t**](reporting_column_async.md) \* | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**combine_targeting_types** | **int** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversion_report_time** | **conversion_report_time_type_t \*** | Date dimension for conversion metrics. | [optional] 
**custom_conversion_event_metrics** | [**list_t**](custom_conversion_event_metrics.md) \* | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**end_date** | **char \*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**end_hour** | **int** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] 
**engagement_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for an engagement action. | [optional] 
**granularity** | **granularity_t \*** |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**level** | **metrics_reporting_level_t \*** | Level of the report | [optional] 
**metrics_filters** | [**list_t**](ads_analytics_metrics_filter.md) \* | List of metrics filters | [optional] 
**primary_sort** | **primary_sort_t \*** |  | [optional] 
**product_group_ids** | **list_t \*** | List of product group ids | [optional] 
**product_group_statuses** | [**list_t**](product_group_summary_status.md) \* | List of values for filtering | [optional] 
**product_item_ids** | **list_t \*** | List of product item ids | [optional] 
**report_format** | **data_output_format_t \*** |  | [optional] 
**reporting_timezone** | **reporting_time_zone_t \*** | Specify the timezone to be applied for the reporting. | [optional] 
**start_date** | **char \*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**start_hour** | **int** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] 
**targeting_types** | [**list_t**](ad_ads_analytics_async_targeting_types.md) \* | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**view_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for a view action. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


