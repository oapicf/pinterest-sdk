# ConversionProductReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | Option<**Vec<String>**> | List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP. | [optional]
**campaign_ids** | Option<**Vec<String>**> | List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN. | [optional]
**campaign_objective_types** | Option<[**Vec<models::ObjectiveType>**](ObjectiveType.md)> | List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. | [optional]
**click_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. | [optional][default to Variant30]
**columns** | [**Vec<models::ConversionProductReportingColumn>**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**conversion_product_attribution_type** | Option<**String**> |  | [optional]
**conversion_product_breakdown** | Option<**String**> |  | [optional]
**conversion_report_time** | Option<[**models::ConversionReportTimeType**](ConversionReportTimeType.md)> | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional][default to TimeOfAdAction]
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | **String** | TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly. | 
**level** | **String** | Level of the report | 
**product_sku_ids** | Option<**Vec<String>**> | List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional]
**report_name** | **String** | Name of the conversion product report. | 
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**view_window_days** | Option<[**models::ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md)> | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day. | [optional][default to Variant30]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


