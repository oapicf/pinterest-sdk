# ConversionProductReportCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **Vec<models::PinterestLibIntegerFormatType>** |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] [default to None]
**campaign_ids** | **Vec<models::PinterestLibIntegerFormatType>** |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] [default to None]
**campaign_objective_types** | [**Vec<models::ConversionObjectiveType>**](ConversionObjectiveType.md) | List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. | [optional] [default to None]
**click_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional] [default to None]
**columns** | [**Vec<models::ConversionProductReportingColumn>**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**conversion_product_attribution_type** | [***models::ConversionProductAttributionType**](ConversionProductAttributionType.md) |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] [default to None]
**conversion_product_breakdown** | [***models::ConversionProductReportBreakdownType**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] [default to None]
**conversion_report_time** | [***models::ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to None]
**end_date** | **String** |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | [***models::ConversionProductReportGranularity**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation | 
**level** | [***models::ConversionProductReportLevel**](ConversionProductReportLevel.md) | Level of the report | 
**product_sku_ids** | **Vec<models::PinterestLibAlphaNumericFormatType>** |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] [default to None]
**report_name** | **String** | Name of the conversion product report | 
**start_date** | **String** |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**view_window_days** | [***models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


