# ConversionProductReportRequest
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **ad\_group\_ids** | **List** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] [default to null] |
| **campaign\_ids** | **List** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] [default to null] |
| **campaign\_objective\_types** | [**List**](ObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] [default to null] |
| **click\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] |
| **columns** | [**List**](ConversionProductReportingColumn.md) | Metric and entity columns | [default to null] |
| **conversion\_product\_attribution\_type** | **String** |  | [optional] [default to null] |
| **conversion\_product\_breakdown** | **String** |  | [optional] [default to null] |
| **conversion\_report\_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] |
| **end\_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. | [default to null] |
| **granularity** | **String** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. | [default to null] |
| **level** | **String** | Level of the report | [default to null] |
| **product\_sku\_ids** | **List** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] [default to null] |
| **report\_name** | **String** | Name of the conversion product report. | [default to null] |
| **start\_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. | [default to null] |
| **view\_window\_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. | [optional] [default to 30] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

