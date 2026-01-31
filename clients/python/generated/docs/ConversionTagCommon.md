# ConversionTagCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_snippet** | **str** | Tag code snippet. | [optional] [readonly] 
**configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] [readonly] 
**enhanced_match_status** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) | The enhanced match status of the tag | [optional] [readonly] 
**id** | **str** | Tag ID. | [optional] [readonly] 
**last_fired_time_ms** | **float** | Time for the last event fired. | [optional] [readonly] 
**name** | **str** | Conversion tag name. | 
**version** | **str** | Version number. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.conversion_tag_common import ConversionTagCommon

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionTagCommon from a JSON string
conversion_tag_common_instance = ConversionTagCommon.from_json(json)
# print the JSON string representation of the object
print(ConversionTagCommon.to_json())

# convert the object into a dict
conversion_tag_common_dict = conversion_tag_common_instance.to_dict()
# create an instance of ConversionTagCommon from a dict
conversion_tag_common_from_dict = ConversionTagCommon.from_dict(conversion_tag_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


