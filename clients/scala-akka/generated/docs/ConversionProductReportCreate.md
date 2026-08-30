

# ConversionProductReportCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | **Seq&lt;String&gt;** |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. |  [optional]
**campaignIds** | **Seq&lt;String&gt;** |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. |  [optional]
**campaignObjectiveTypes** | **Seq&lt;ConversionObjectiveType&gt;** | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. |  [optional]
**clickWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional]
**columns** | **Seq&lt;ConversionProductReportingColumn&gt;** | Metric and entity columns | 
**conversionProductAttributionType** | **ConversionProductAttributionType** |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. |  [optional]
**conversionProductBreakdown** | **ConversionProductReportBreakdownType** | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. |  [optional]
**conversionReportTime** | **ConversionReportTimeType** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional]
**endDate** | **String** |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | **ConversionProductReportGranularity** | Report granularity for time-based metric aggregation | 
**level** | **ConversionProductReportLevel** | Level of the report | 
**productSkuIds** | **Seq&lt;String&gt;** |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. |  [optional]
**reportName** | **String** | Name of the conversion product report | 
**startDate** | **String** |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**viewWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. |  [optional]



