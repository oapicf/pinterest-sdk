# ConversionProductReportCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | **string** | List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**campaignIds** | **string** | List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**campaignObjectiveTypes** | [**OpenAPI\Server\Model\ConversionObjectiveType**](ConversionObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**clickWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**columns** | [**OpenAPI\Server\Model\ConversionProductReportingColumn**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**conversionProductAttributionType** | [**OpenAPI\Server\Model\ConversionProductAttributionType**](ConversionProductAttributionType.md) | Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] [default to ConversionProductAttributionType::_DEFAULT]
**conversionProductBreakdown** | [**OpenAPI\Server\Model\ConversionProductReportBreakdownType**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] [default to ConversionProductReportBreakdownType::PRODUCT_BRAND]
**conversionReportTime** | [**OpenAPI\Server\Model\ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to ConversionReportTimeType::TIME_OF_AD_ACTION]
**endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | [**OpenAPI\Server\Model\ConversionProductReportGranularity**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation | 
**level** | [**OpenAPI\Server\Model\ConversionProductReportLevel**](ConversionProductReportLevel.md) | Level of the report | 
**productSkuIds** | **string** | List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**reportName** | **string** | Name of the conversion product report | 
**startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**viewWindowDays** | [**OpenAPI\Server\Model\ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 30]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


