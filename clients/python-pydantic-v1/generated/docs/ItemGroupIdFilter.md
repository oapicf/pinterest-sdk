# ItemGroupIdFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_group_id** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 

## Example

```python
from openapi_client.models.item_group_id_filter import ItemGroupIdFilter

# TODO update the JSON string below
json = "{}"
# create an instance of ItemGroupIdFilter from a JSON string
item_group_id_filter_instance = ItemGroupIdFilter.from_json(json)
# print the JSON string representation of the object
print ItemGroupIdFilter.to_json()

# convert the object into a dict
item_group_id_filter_dict = item_group_id_filter_instance.to_dict()
# create an instance of ItemGroupIdFilter from a dict
item_group_id_filter_from_dict = ItemGroupIdFilter.from_dict(item_group_id_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


