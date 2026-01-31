# Paginated


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | **List[object]** |  | 

## Example

```python
from pinterestsdk.models.paginated import Paginated

# TODO update the JSON string below
json = "{}"
# create an instance of Paginated from a JSON string
paginated_instance = Paginated.from_json(json)
# print the JSON string representation of the object
print(Paginated.to_json())

# convert the object into a dict
paginated_dict = paginated_instance.to_dict()
# create an instance of Paginated from a dict
paginated_from_dict = Paginated.from_dict(paginated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


