# ConversionProductReportCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **List[str]** |   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP. | [optional] 
**campaign_ids** | **List[str]** |   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN. | [optional] 
**campaign_objective_types** | [**List[ConversionObjectiveType]**](ConversionObjectiveType.md) | List of values for filtering. Default is [&#39;CONSIDERATION&#39;,&#39;AWARENESS&#39;,&#39;WEB_CONVERSION&#39;,&#39;VIDEO_COMPLETION&#39;]. | [optional] 
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
**columns** | [**List[ConversionProductReportingColumn]**](ConversionProductReportingColumn.md) | Metric and entity columns | 
**conversion_product_attribution_type** | [**ConversionProductAttributionType**](ConversionProductAttributionType.md) |   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01. | [optional] 
**conversion_product_breakdown** | [**ConversionProductReportBreakdownType**](ConversionProductReportBreakdownType.md) | Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU. | [optional] 
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
**end_date** | **str** |   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports. | 
**granularity** | [**ConversionProductReportGranularity**](ConversionProductReportGranularity.md) | Report granularity for time-based metric aggregation | 
**level** | [**ConversionProductReportLevel**](ConversionProductReportLevel.md) | Level of the report | 
**product_sku_ids** | **List[str]** |   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. | [optional] 
**report_name** | **str** | Name of the conversion product report | 
**start_date** | **str** |   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required. | 
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 

## Example

```python
from openapi_client.models.conversion_product_report_create import ConversionProductReportCreate

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionProductReportCreate from a JSON string
conversion_product_report_create_instance = ConversionProductReportCreate.from_json(json)
# print the JSON string representation of the object
print ConversionProductReportCreate.to_json()

# convert the object into a dict
conversion_product_report_create_dict = conversion_product_report_create_instance.to_dict()
# create an instance of ConversionProductReportCreate from a dict
conversion_product_report_create_from_dict = ConversionProductReportCreate.from_dict(conversion_product_report_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


