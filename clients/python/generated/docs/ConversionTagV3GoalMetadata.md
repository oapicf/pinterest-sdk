# ConversionTagV3GoalMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**AttributionWindows**](AttributionWindows.md) |  | [optional] 
**conversion_event** | [**ConversionEvent**](ConversionEvent.md) |  | [optional] 
**conversion_tag_id** | **str** |  | [optional] 
**cpa_goal_value_in_micro_currency** | **str** |  | [optional] 
**is_roas_optimized** | **bool** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional] 
**reporting_event** | **str** | Event name for custom or standard events mapped to an oCPM model | [optional] 

## Example

```python
from pinterestsdk.models.conversion_tag_v3_goal_metadata import ConversionTagV3GoalMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionTagV3GoalMetadata from a JSON string
conversion_tag_v3_goal_metadata_instance = ConversionTagV3GoalMetadata.from_json(json)
# print the JSON string representation of the object
print(ConversionTagV3GoalMetadata.to_json())

# convert the object into a dict
conversion_tag_v3_goal_metadata_dict = conversion_tag_v3_goal_metadata_instance.to_dict()
# create an instance of ConversionTagV3GoalMetadata from a dict
conversion_tag_v3_goal_metadata_from_dict = ConversionTagV3GoalMetadata.from_dict(conversion_tag_v3_goal_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


