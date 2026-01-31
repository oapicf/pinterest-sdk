# ConversionProductReportRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupIds** | **String[]** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**CampaignIds** | **String[]** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**CampaignObjectiveTypes** | [**ObjectiveType[]**](ObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**ClickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**Columns** | [**ConversionProductReportingColumn[]**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**ConversionProductAttributionType** | **String** |  | [optional] 
**ConversionProductBreakdown** | **String** |  | [optional] 
**ConversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to "TIME_OF_AD_ACTION"]
**EndDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. | 
**Granularity** | **String** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. | 
**Level** | **String** | Level of the report | 
**ProductSkuIds** | **String[]** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**ReportName** | **String** | Name of the conversion product report. | 
**StartDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**ViewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. | [optional] [default to 30]

## Examples

- Prepare the resource
```powershell
$ConversionProductReportRequest = Initialize-PSOpenAPIToolsConversionProductReportRequest  -AdGroupIds [&quot;12345678&quot;] `
 -CampaignIds [&quot;12345678&quot;] `
 -CampaignObjectiveTypes null `
 -ClickWindowDays null `
 -Columns null `
 -ConversionProductAttributionType null `
 -ConversionProductBreakdown null `
 -ConversionReportTime null `
 -EndDate 2024-04-23 `
 -Granularity null `
 -Level null `
 -ProductSkuIds [&quot;WBC45678&quot;,&quot;WBC45679&quot;] `
 -ReportName null `
 -StartDate 2024-03-17 `
 -ViewWindowDays null
```

- Convert the resource to JSON
```powershell
$ConversionProductReportRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

