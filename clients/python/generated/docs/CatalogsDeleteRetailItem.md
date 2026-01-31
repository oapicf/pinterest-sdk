# CatalogsDeleteRetailItem

An item to be deleted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **str** | The catalog item id in the merchant namespace | 
**last_updated_time** | **int** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_delete_retail_item import CatalogsDeleteRetailItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsDeleteRetailItem from a JSON string
catalogs_delete_retail_item_instance = CatalogsDeleteRetailItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsDeleteRetailItem.to_json())

# convert the object into a dict
catalogs_delete_retail_item_dict = catalogs_delete_retail_item_instance.to_dict()
# create an instance of CatalogsDeleteRetailItem from a dict
catalogs_delete_retail_item_from_dict = CatalogsDeleteRetailItem.from_dict(catalogs_delete_retail_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


