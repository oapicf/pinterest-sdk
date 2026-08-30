# ItemIdStoreCodePair

A pair of item_id and store_code that uniquely identifies a local inventory item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **str** | Catalog item id in the merchant namespace | 
**store_code** | **str** | Store code for the local inventory item | 

## Example

```python
from openapi_client.models.item_id_store_code_pair import ItemIdStoreCodePair

# TODO update the JSON string below
json = "{}"
# create an instance of ItemIdStoreCodePair from a JSON string
item_id_store_code_pair_instance = ItemIdStoreCodePair.from_json(json)
# print the JSON string representation of the object
print ItemIdStoreCodePair.to_json()

# convert the object into a dict
item_id_store_code_pair_dict = item_id_store_code_pair_instance.to_dict()
# create an instance of ItemIdStoreCodePair from a dict
item_id_store_code_pair_from_dict = ItemIdStoreCodePair.from_dict(item_id_store_code_pair_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


