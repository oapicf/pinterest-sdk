# CatalogsCreateRetailItem

An item to be created

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**item_id** | **str** | The catalog item id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_create_retail_item import CatalogsCreateRetailItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreateRetailItem from a JSON string
catalogs_create_retail_item_instance = CatalogsCreateRetailItem.from_json(json)
# print the JSON string representation of the object
print CatalogsCreateRetailItem.to_json()

# convert the object into a dict
catalogs_create_retail_item_dict = catalogs_create_retail_item_instance.to_dict()
# create an instance of CatalogsCreateRetailItem from a dict
catalogs_create_retail_item_from_dict = CatalogsCreateRetailItem.from_dict(catalogs_create_retail_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


