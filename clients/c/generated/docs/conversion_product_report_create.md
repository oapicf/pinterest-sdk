# conversion_product_report_create_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **list_t \*** |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**campaign_ids** | **list_t \*** |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**campaign_objective_types** | [**list_t**](conversion_objective_type.md) \* | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**click_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
**columns** | [**list_t**](conversion_product_reporting_column.md) \* | Metric and entity columns | 
**conversion_product_attribution_type** | **conversion_product_attribution_type_t \*** |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] 
**conversion_product_breakdown** | **conversion_product_report_breakdown_type_t \*** | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] 
**conversion_report_time** | **conversion_report_time_type_t \*** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
**end_date** | **char \*** |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | **conversion_product_report_granularity_t \*** | Report granularity for time-based metric aggregation | 
**level** | **conversion_product_report_level_t \*** | Level of the report | 
**product_sku_ids** | **list_t \*** |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**report_name** | **char \*** | Name of the conversion product report | 
**start_date** | **char \*** |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**view_window_days** | **conversion_attribution_window_days_t \*** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


