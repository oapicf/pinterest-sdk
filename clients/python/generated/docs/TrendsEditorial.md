# TrendsEditorial

Information of the published editorial article.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**board_url** | **str** | URL of the editorial board | 
**description** | **str** | Description of the editorial article | 
**interests** | **List[str]** | List of interests related to the editorial article | 
**pins_url** | **List[str]** | URL of the pins related to the editorial article | 
**related_keywords** | [**List[KeywordInfo]**](KeywordInfo.md) | List of keywords related to the editorial article | 
**title** | **str** | Title of the editorial article | 

## Example

```python
from pinterestsdk.models.trends_editorial import TrendsEditorial

# TODO update the JSON string below
json = "{}"
# create an instance of TrendsEditorial from a JSON string
trends_editorial_instance = TrendsEditorial.from_json(json)
# print the JSON string representation of the object
print(TrendsEditorial.to_json())

# convert the object into a dict
trends_editorial_dict = trends_editorial_instance.to_dict()
# create an instance of TrendsEditorial from a dict
trends_editorial_from_dict = TrendsEditorial.from_dict(trends_editorial_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


