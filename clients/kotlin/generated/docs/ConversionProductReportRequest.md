
# ConversionProductReportRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columns** | [**kotlin.collections.List&lt;ConversionProductReportingColumn&gt;**](ConversionProductReportingColumn.md) | Metric and entity columns |  |
| **endDate** | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. |  |
| **granularity** | [**inline**](#Granularity) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. |  |
| **level** | [**inline**](#Level) | Level of the report |  |
| **reportName** | **kotlin.String** | Name of the conversion product report. |  |
| **startDate** | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. |  |
| **adGroupIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. |  [optional] |
| **campaignIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. |  [optional] |
| **campaignObjectiveTypes** | [**kotlin.collections.List&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. |  [optional] |
| **clickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] |
| **conversionProductAttributionType** | [**inline**](#ConversionProductAttributionType) |  |  [optional] |
| **conversionProductBreakdown** | [**inline**](#ConversionProductBreakdown) |  |  [optional] |
| **conversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional] |
| **productSkuIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. |  [optional] |
| **viewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. |  [optional] |


<a id="Granularity"></a>
## Enum: granularity
| Name | Value |
| ---- | ----- |
| granularity | WEEK, MONTH, TOTAL |


<a id="Level"></a>
## Enum: level
| Name | Value |
| ---- | ----- |
| level | ADVERTISER, CAMPAIGN, AD_GROUP |


<a id="ConversionProductAttributionType"></a>
## Enum: conversion_product_attribution_type
| Name | Value |
| ---- | ----- |
| conversionProductAttributionType | DEFAULT, BRAND_ATTRIBUTION |


<a id="ConversionProductBreakdown"></a>
## Enum: conversion_product_breakdown
| Name | Value |
| ---- | ----- |
| conversionProductBreakdown | PRODUCT_BRAND, PRODUCT_CATEGORY, PRODUCT_BRAND_AND_CATEGORY, PRODUCT_SKU, PRODUCT_SKU_GROUP |



