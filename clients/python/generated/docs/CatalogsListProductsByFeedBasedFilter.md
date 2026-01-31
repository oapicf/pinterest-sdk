# CatalogsListProductsByFeedBasedFilter

Request object to list products for a given feed_id and product group filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**feed_id** | **str** | Catalog Feed id pertaining to the catalog product group filter. | 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_list_products_by_feed_based_filter import CatalogsListProductsByFeedBasedFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsListProductsByFeedBasedFilter from a JSON string
catalogs_list_products_by_feed_based_filter_instance = CatalogsListProductsByFeedBasedFilter.from_json(json)
# print the JSON string representation of the object
print(CatalogsListProductsByFeedBasedFilter.to_json())

# convert the object into a dict
catalogs_list_products_by_feed_based_filter_dict = catalogs_list_products_by_feed_based_filter_instance.to_dict()
# create an instance of CatalogsListProductsByFeedBasedFilter from a dict
catalogs_list_products_by_feed_based_filter_from_dict = CatalogsListProductsByFeedBasedFilter.from_dict(catalogs_list_products_by_feed_based_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


