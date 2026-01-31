

# ConversionProductReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupIds** | **List&lt;String&gt;** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. |  [optional]
**campaignIds** | **List&lt;String&gt;** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. |  [optional]
**campaignObjectiveTypes** | [**List&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. |  [optional]
**clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional]
**columns** | [**List&lt;ConversionProductReportingColumn&gt;**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**conversionProductAttributionType** | [**ConversionProductAttributionTypeEnum**](#ConversionProductAttributionTypeEnum) |  |  [optional]
**conversionProductBreakdown** | [**ConversionProductBreakdownEnum**](#ConversionProductBreakdownEnum) |  |  [optional]
**conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional]
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | [**GranularityEnum**](#GranularityEnum) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. | 
**level** | [**LevelEnum**](#LevelEnum) | Level of the report | 
**productSkuIds** | **List&lt;String&gt;** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. |  [optional]
**reportName** | **String** | Name of the conversion product report. | 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. |  [optional]


## Enum: ConversionProductAttributionTypeEnum

Name | Value
---- | -----


## Enum: ConversionProductBreakdownEnum

Name | Value
---- | -----


## Enum: GranularityEnum

Name | Value
---- | -----


## Enum: LevelEnum

Name | Value
---- | -----




