# LinkFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**link** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.link_filter import LinkFilter

# TODO update the JSON string below
json = "{}"
# create an instance of LinkFilter from a JSON string
link_filter_instance = LinkFilter.from_json(json)
# print the JSON string representation of the object
print(LinkFilter.to_json())

# convert the object into a dict
link_filter_dict = link_filter_instance.to_dict()
# create an instance of LinkFilter from a dict
link_filter_from_dict = LinkFilter.from_dict(link_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


