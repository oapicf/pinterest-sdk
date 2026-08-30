# CatalogsRetailReportAllItemsFilter

ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**product_group_id** | **str** | Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. | [optional] 
**report_type** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_retail_report_all_items_filter import CatalogsRetailReportAllItemsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailReportAllItemsFilter from a JSON string
catalogs_retail_report_all_items_filter_instance = CatalogsRetailReportAllItemsFilter.from_json(json)
# print the JSON string representation of the object
print CatalogsRetailReportAllItemsFilter.to_json()

# convert the object into a dict
catalogs_retail_report_all_items_filter_dict = catalogs_retail_report_all_items_filter_instance.to_dict()
# create an instance of CatalogsRetailReportAllItemsFilter from a dict
catalogs_retail_report_all_items_filter_from_dict = CatalogsRetailReportAllItemsFilter.from_dict(catalogs_retail_report_all_items_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


