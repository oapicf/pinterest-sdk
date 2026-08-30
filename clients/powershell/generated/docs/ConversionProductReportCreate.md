# ConversionProductReportCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupIds** | **String[]** |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**CampaignIds** | **String[]** |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**CampaignObjectiveTypes** | [**ConversionObjectiveType[]**](ConversionObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**ClickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
**Columns** | [**ConversionProductReportingColumn[]**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**ConversionProductAttributionType** | [**ConversionProductAttributionType**](ConversionProductAttributionType.md) |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] 
**ConversionProductBreakdown** | [**ConversionProductReportBreakdownType**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] 
**ConversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
**EndDate** | **String** |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**Granularity** | [**ConversionProductReportGranularity**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation | 
**Level** | [**ConversionProductReportLevel**](ConversionProductReportLevel.md) | Level of the report | 
**ProductSkuIds** | **String[]** |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**ReportName** | **String** | Name of the conversion product report | 
**StartDate** | **String** |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**ViewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionProductReportCreate = Initialize-PSOpenAPIToolsConversionProductReportCreate  -AdGroupIds [&quot;12345678&quot;] `
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
 -StartDate 2024-04-17 `
 -ViewWindowDays null
```

- Convert the resource to JSON
```powershell
$ConversionProductReportCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

