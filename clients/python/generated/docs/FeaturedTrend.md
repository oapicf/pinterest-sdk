# FeaturedTrend

Featured trending topics for a specific interest and market

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**interest** | [**InterestsEnum**](InterestsEnum.md) | The main interest category | 
**market** | [**ProductCategoryRegion**](ProductCategoryRegion.md) | Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.) | [optional] 
**trends** | [**List[TrendingTopic]**](TrendingTopic.md) | List of trending topics within this interest category | [optional] 

## Example

```python
from pinterestsdk.models.featured_trend import FeaturedTrend

# TODO update the JSON string below
json = "{}"
# create an instance of FeaturedTrend from a JSON string
featured_trend_instance = FeaturedTrend.from_json(json)
# print the JSON string representation of the object
print(FeaturedTrend.to_json())

# convert the object into a dict
featured_trend_dict = featured_trend_instance.to_dict()
# create an instance of FeaturedTrend from a dict
featured_trend_from_dict = FeaturedTrend.from_dict(featured_trend_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


