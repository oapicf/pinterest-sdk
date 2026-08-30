# CatalogsFeedProductCounts

The counts can be null early in the process.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ingested** | **int** | The number of products successfully ingested from the feed file. | [optional] 
**original** | **int** | The number of products in the feed file. | [optional] 

## Example

```python
from openapi_client.models.catalogs_feed_product_counts import CatalogsFeedProductCounts

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedProductCounts from a JSON string
catalogs_feed_product_counts_instance = CatalogsFeedProductCounts.from_json(json)
# print the JSON string representation of the object
print CatalogsFeedProductCounts.to_json()

# convert the object into a dict
catalogs_feed_product_counts_dict = catalogs_feed_product_counts_instance.to_dict()
# create an instance of CatalogsFeedProductCounts from a dict
catalogs_feed_product_counts_from_dict = CatalogsFeedProductCounts.from_dict(catalogs_feed_product_counts_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


