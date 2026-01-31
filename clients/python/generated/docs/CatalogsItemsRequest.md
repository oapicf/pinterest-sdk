# CatalogsItemsRequest

Request object of catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**filters** | [**CatalogsItemsPostFilters**](CatalogsItemsPostFilters.md) |  | 
**language** | **str** | We recommend using the CatalogsLocale values. | 

## Example

```python
from pinterestsdk.models.catalogs_items_request import CatalogsItemsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsRequest from a JSON string
catalogs_items_request_instance = CatalogsItemsRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsItemsRequest.to_json())

# convert the object into a dict
catalogs_items_request_dict = catalogs_items_request_instance.to_dict()
# create an instance of CatalogsItemsRequest from a dict
catalogs_items_request_from_dict = CatalogsItemsRequest.from_dict(catalogs_items_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


