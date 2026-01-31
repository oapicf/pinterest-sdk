# OptimizationGoalMetadataConversionTagV3GoalMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  | [optional] 
**conversion_event** | **str** |  | [optional] 
**conversion_tag_id** | **str** |  | [optional] 
**cpa_goal_value_in_micro_currency** | **str** |  | [optional] 
**is_roas_optimized** | **bool** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. | [optional] 
**learning_mode_type** | **str** | Conversion learning model type | [optional] 
**reporting_event** | **str** | Event name for custom or standard events mapped to an oCPM model | [optional] 

## Example

```python
from pinterestsdk.models.optimization_goal_metadata_conversion_tag_v3_goal_metadata import OptimizationGoalMetadataConversionTagV3GoalMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of OptimizationGoalMetadataConversionTagV3GoalMetadata from a JSON string
optimization_goal_metadata_conversion_tag_v3_goal_metadata_instance = OptimizationGoalMetadataConversionTagV3GoalMetadata.from_json(json)
# print the JSON string representation of the object
print(OptimizationGoalMetadataConversionTagV3GoalMetadata.to_json())

# convert the object into a dict
optimization_goal_metadata_conversion_tag_v3_goal_metadata_dict = optimization_goal_metadata_conversion_tag_v3_goal_metadata_instance.to_dict()
# create an instance of OptimizationGoalMetadataConversionTagV3GoalMetadata from a dict
optimization_goal_metadata_conversion_tag_v3_goal_metadata_from_dict = OptimizationGoalMetadataConversionTagV3GoalMetadata.from_dict(optimization_goal_metadata_conversion_tag_v3_goal_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


