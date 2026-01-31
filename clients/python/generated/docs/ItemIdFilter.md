# ItemIdFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.item_id_filter import ItemIdFilter

# TODO update the JSON string below
json = "{}"
# create an instance of ItemIdFilter from a JSON string
item_id_filter_instance = ItemIdFilter.from_json(json)
# print the JSON string representation of the object
print(ItemIdFilter.to_json())

# convert the object into a dict
item_id_filter_dict = item_id_filter_instance.to_dict()
# create an instance of ItemIdFilter from a dict
item_id_filter_from_dict = ItemIdFilter.from_dict(item_id_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


