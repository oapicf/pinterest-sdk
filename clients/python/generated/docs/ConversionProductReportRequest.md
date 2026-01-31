# ConversionProductReportRequest

Request for a brand, category, SKU report

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **List[str]** | List of ad group ids. &lt;br&gt;Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**campaign_ids** | **List[str]** | List of campaign ids. &lt;br&gt;Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**campaign_objective_types** | [**List[ObjectiveType]**](ObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays.NUMBER_30]
**columns** | [**List[ConversionProductReportingColumn]**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**conversion_product_attribution_type** | **str** |  | [optional] 
**conversion_product_breakdown** | **str** |  | [optional] 
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to 'TIME_OF_AD_ACTION']
**end_date** | **str** | Metric report end date (UTC). Format: YYYY-MM-DD.&lt;br&gt; A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | **str** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; WEEK - metrics are broken down weekly.&lt;br&gt; MONTH - metrics are broken down monthly. | 
**level** | **str** | Level of the report | 
**product_sku_ids** | **List[str]** | List of SKU ids. &lt;br&gt;Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**report_name** | **str** | Name of the conversion product report. | 
**start_date** | **str** | Metric report start date (UTC). Format: YYYY-MM-DD.&lt;br&gt; Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; day. | [optional] [default to ConversionAttributionWindowDays.NUMBER_30]

## Example

```python
from pinterestsdk.models.conversion_product_report_request import ConversionProductReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionProductReportRequest from a JSON string
conversion_product_report_request_instance = ConversionProductReportRequest.from_json(json)
# print the JSON string representation of the object
print(ConversionProductReportRequest.to_json())

# convert the object into a dict
conversion_product_report_request_dict = conversion_product_report_request_instance.to_dict()
# create an instance of ConversionProductReportRequest from a dict
conversion_product_report_request_from_dict = ConversionProductReportRequest.from_dict(conversion_product_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


