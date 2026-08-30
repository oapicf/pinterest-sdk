# CONVERSION_PRODUCT_REPORT_CREATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | [**LIST [STRING_32]**](STRING_32.md) |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] [default to null]
**campaign_ids** | [**LIST [STRING_32]**](STRING_32.md) |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] [default to null]
**campaign_objective_types** | [**LIST [CONVERSION_OBJECTIVE_TYPE]**](ConversionObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] [default to null]
**click_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_30]
**columns** | [**LIST [CONVERSION_PRODUCT_REPORTING_COLUMN]**](ConversionProductReportingColumn.md) | Metric and entity columns | [default to null]
**conversion_product_attribution_type** | [**CONVERSION_PRODUCT_ATTRIBUTION_TYPE**](ConversionProductAttributionType.md) |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] [default to DEFAULT]
**conversion_product_breakdown** | [**CONVERSION_PRODUCT_REPORT_BREAKDOWN_TYPE**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] [default to PRODUCT_BRAND]
**conversion_report_time** | [**CONVERSION_REPORT_TIME_TYPE**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION]
**end_date** | [**STRING_32**](STRING_32.md) |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | [default to null]
**granularity** | [**CONVERSION_PRODUCT_REPORT_GRANULARITY**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation | [default to null]
**level** | [**CONVERSION_PRODUCT_REPORT_LEVEL**](ConversionProductReportLevel.md) | Level of the report | [default to null]
**product_sku_ids** | [**LIST [STRING_32]**](STRING_32.md) |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] [default to null]
**report_name** | [**STRING_32**](STRING_32.md) | Name of the conversion product report | [default to null]
**start_date** | [**STRING_32**](STRING_32.md) |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | [default to null]
**view_window_days** | [**CONVERSION_ATTRIBUTION_WINDOW_DAYS**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to CONVERSION_ATTRIBUTION_WINDOW_DAYS.NUMBER_30]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


