# TitleKeywordsFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**title_keywords** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.title_keywords_filter import TitleKeywordsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of TitleKeywordsFilter from a JSON string
title_keywords_filter_instance = TitleKeywordsFilter.from_json(json)
# print the JSON string representation of the object
print(TitleKeywordsFilter.to_json())

# convert the object into a dict
title_keywords_filter_dict = title_keywords_filter_instance.to_dict()
# create an instance of TitleKeywordsFilter from a dict
title_keywords_filter_from_dict = TitleKeywordsFilter.from_dict(title_keywords_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


