# ads_analytics_create_async_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_date** | **char \*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **char \*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **granularity_t \*** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**click_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**engagement_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**view_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**conversion_report_time** | **conversion_report_time_type_t \*** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to 'TIME_OF_AD_ACTION']
**attribution_types** | [**list_t**](conversion_report_attribution_type.md) \* | List of types of attribution for the conversion report | [optional] 
**campaign_ids** | **list_t \*** | List of campaign ids | [optional] 
**campaign_statuses** | [**list_t**](campaign_summary_status.md) \* | List of status values for filtering | [optional] 
**campaign_objective_types** | [**list_t**](objective_type.md) \* | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] 
**ad_group_ids** | **list_t \*** | List of ad group ids | [optional] 
**ad_group_statuses** | [**list_t**](ad_group_summary_status.md) \* | List of values for filtering | [optional] 
**ad_ids** | **list_t \*** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] 
**ad_statuses** | [**list_t**](pin_promotion_summary_status.md) \* | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] 
**product_group_ids** | **list_t \*** | List of product group ids | [optional] 
**product_group_statuses** | [**list_t**](product_group_summary_status.md) \* | List of values for filtering | [optional] 
**product_item_ids** | **list_t \*** | List of product item ids | [optional] 
**targeting_types** | [**list_t**](ads_analytics_targeting_type.md) \* | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**metrics_filters** | [**list_t**](ads_analytics_metrics_filter.md) \* | List of metrics filters | [optional] 
**columns** | [**list_t**](reporting_column_async.md) \* | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**level** | **metrics_reporting_level_t \*** | Level of the report | 
**report_format** | **data_output_format_t \*** | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to 'JSON']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


