# CatalogsUpdateRetailItem

An item to be updated

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | 
**item_id** | **str** | The catalog item id in the merchant namespace | 
**operation** | **str** |  | 
**update_mask** | [**List[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

## Example

```python
from openapi_client.models.catalogs_update_retail_item import CatalogsUpdateRetailItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsUpdateRetailItem from a JSON string
catalogs_update_retail_item_instance = CatalogsUpdateRetailItem.from_json(json)
# print the JSON string representation of the object
print CatalogsUpdateRetailItem.to_json()

# convert the object into a dict
catalogs_update_retail_item_dict = catalogs_update_retail_item_instance.to_dict()
# create an instance of CatalogsUpdateRetailItem from a dict
catalogs_update_retail_item_from_dict = CatalogsUpdateRetailItem.from_dict(catalogs_update_retail_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


