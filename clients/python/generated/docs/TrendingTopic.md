# TrendingTopic

Individual trending topic within an interest category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Description of the trending topic | 
**percent_growth_mom** | **int** | Month-over-month growth percentage | 
**pins** | [**List[TrendingPin]**](TrendingPin.md) | Array of pin images related to this trend (up to 6) | 
**related_interests** | **List[str]** | List of related interest categories | 
**related_searches** | **List[str]** | List of related search terms | 
**time_series** | **Dict[str, float]** | Time series data showing trend values over time, with dates as keys and values as numeric | 
**title** | **str** | Title of the trending topic | 

## Example

```python
from pinterestsdk.models.trending_topic import TrendingTopic

# TODO update the JSON string below
json = "{}"
# create an instance of TrendingTopic from a JSON string
trending_topic_instance = TrendingTopic.from_json(json)
# print the JSON string representation of the object
print(TrendingTopic.to_json())

# convert the object into a dict
trending_topic_dict = trending_topic_instance.to_dict()
# create an instance of TrendingTopic from a dict
trending_topic_from_dict = TrendingTopic.from_dict(trending_topic_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


