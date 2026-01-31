# CatalogsReportAllItemsFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Unique identifier of a catalog. If not given, oldest catalog will be used | [optional] 
**report_type** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_report_all_items_filter import CatalogsReportAllItemsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsReportAllItemsFilter from a JSON string
catalogs_report_all_items_filter_instance = CatalogsReportAllItemsFilter.from_json(json)
# print the JSON string representation of the object
print(CatalogsReportAllItemsFilter.to_json())

# convert the object into a dict
catalogs_report_all_items_filter_dict = catalogs_report_all_items_filter_instance.to_dict()
# create an instance of CatalogsReportAllItemsFilter from a dict
catalogs_report_all_items_filter_from_dict = CatalogsReportAllItemsFilter.from_dict(catalogs_report_all_items_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


