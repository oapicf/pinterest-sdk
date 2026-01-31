

# ConversionProductReportRequest

Request for a brand, category, SKU report

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adGroupIds** | **List&lt;String&gt;** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. |  [optional] |
|**campaignObjectiveTypes** | **List&lt;ObjectiveType&gt;** | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. |  [optional] |
|**clickWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] |
|**columns** | **List&lt;ConversionProductReportingColumn&gt;** | Metric and entity columns |  |
|**conversionProductAttributionType** | [**ConversionProductAttributionTypeEnum**](#ConversionProductAttributionTypeEnum) |  |  [optional] |
|**conversionProductBreakdown** | [**ConversionProductBreakdownEnum**](#ConversionProductBreakdownEnum) |  |  [optional] |
|**conversionReportTime** | **ConversionReportTimeType** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional] |
|**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. |  |
|**granularity** | [**GranularityEnum**](#GranularityEnum) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. |  |
|**level** | [**LevelEnum**](#LevelEnum) | Level of the report |  |
|**productSkuIds** | **List&lt;String&gt;** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. |  [optional] |
|**reportName** | **String** | Name of the conversion product report. |  |
|**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. |  |
|**viewWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. |  [optional] |



## Enum: ConversionProductAttributionTypeEnum

| Name | Value |
|---- | -----|
| DEFAULT | &quot;DEFAULT&quot; |
| BRAND_ATTRIBUTION | &quot;BRAND_ATTRIBUTION&quot; |



## Enum: ConversionProductBreakdownEnum

| Name | Value |
|---- | -----|
| PRODUCT_BRAND | &quot;PRODUCT_BRAND&quot; |
| PRODUCT_CATEGORY | &quot;PRODUCT_CATEGORY&quot; |
| PRODUCT_BRAND_AND_CATEGORY | &quot;PRODUCT_BRAND_AND_CATEGORY&quot; |
| PRODUCT_SKU | &quot;PRODUCT_SKU&quot; |
| PRODUCT_SKU_GROUP | &quot;PRODUCT_SKU_GROUP&quot; |



## Enum: GranularityEnum

| Name | Value |
|---- | -----|
| WEEK | &quot;WEEK&quot; |
| MONTH | &quot;MONTH&quot; |
| TOTAL | &quot;TOTAL&quot; |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| ADVERTISER | &quot;ADVERTISER&quot; |
| CAMPAIGN | &quot;CAMPAIGN&quot; |
| AD_GROUP | &quot;AD_GROUP&quot; |



