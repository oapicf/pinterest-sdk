# ConversionProductReportRequest

Request for a brand, category, SKU report

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **Array&lt;string&gt;** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] [default to undefined]
**campaign_ids** | **Array&lt;string&gt;** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] [default to undefined]
**campaign_objective_types** | [**Array&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering. Default is [\&#39;CONSIDERATION\&#39;,\&#39;AWARENESS\&#39;,\&#39;WEB_CONVERSION\&#39;,\&#39;VIDEO_COMPLETION\&#39;]. | [optional] [default to undefined]
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays_NUMBER_30]
**columns** | [**Array&lt;ConversionProductReportingColumn&gt;**](ConversionProductReportingColumn.md) | Metric and entity columns | [default to undefined]
**conversion_product_attribution_type** | **string** |  | [optional] [default to undefined]
**conversion_product_breakdown** | **string** |  | [optional] [default to undefined]
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to ConversionReportTimeType_TimeOfAdAction]
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. | [default to undefined]
**granularity** | **string** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. | [default to undefined]
**level** | **string** | Level of the report | [default to undefined]
**product_sku_ids** | **Array&lt;string&gt;** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] [default to undefined]
**report_name** | **string** | Name of the conversion product report. | [default to undefined]
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. | [default to undefined]
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. | [optional] [default to ConversionAttributionWindowDays_NUMBER_30]

## Example

```typescript
import { ConversionProductReportRequest } from './api';

const instance: ConversionProductReportRequest = {
    ad_group_ids,
    campaign_ids,
    campaign_objective_types,
    click_window_days,
    columns,
    conversion_product_attribution_type,
    conversion_product_breakdown,
    conversion_report_time,
    end_date,
    granularity,
    level,
    product_sku_ids,
    report_name,
    start_date,
    view_window_days,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
