# MediaTypeFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**media_type** | [**CatalogsProductGroupMultipleMediaTypesCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.media_type_filter import MediaTypeFilter

# TODO update the JSON string below
json = "{}"
# create an instance of MediaTypeFilter from a JSON string
media_type_filter_instance = MediaTypeFilter.from_json(json)
# print the JSON string representation of the object
print(MediaTypeFilter.to_json())

# convert the object into a dict
media_type_filter_dict = media_type_filter_instance.to_dict()
# create an instance of MediaTypeFilter from a dict
media_type_filter_from_dict = MediaTypeFilter.from_dict(media_type_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


