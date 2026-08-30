# ConversionProductReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **string[]** | List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional]
**campaign_ids** | **string[]** | List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional]
**campaign_objective_types** | [**\OpenAPI\Client\Model\ConversionObjectiveType[]**](ConversionObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional]
**click_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**columns** | [**\OpenAPI\Client\Model\ConversionProductReportingColumn[]**](ConversionProductReportingColumn.md) | Metric and entity columns |
**conversion_product_attribution_type** | [**\OpenAPI\Client\Model\ConversionProductAttributionType**](ConversionProductAttributionType.md) | Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] [default to ConversionProductAttributionType::_DEFAULT]
**conversion_product_breakdown** | [**\OpenAPI\Client\Model\ConversionProductReportBreakdownType**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] [default to ConversionProductReportBreakdownType::PRODUCT_BRAND]
**conversion_report_time** | [**\OpenAPI\Client\Model\ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to ConversionReportTimeType::TIME_OF_AD_ACTION]
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. |
**granularity** | [**\OpenAPI\Client\Model\ConversionProductReportGranularity**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation |
**level** | [**\OpenAPI\Client\Model\ConversionProductReportLevel**](ConversionProductReportLevel.md) | Level of the report |
**product_sku_ids** | **string[]** | List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional]
**report_name** | **string** | Name of the conversion product report |
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. |
**view_window_days** | [**\OpenAPI\Client\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 30]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
