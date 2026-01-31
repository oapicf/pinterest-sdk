# ConversionEventResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Id of the ad account. | [optional] 
**conversion_event** | [**ConversionTagType**](ConversionTagType.md) |  | [optional] 
**conversion_tag_id** | **str** | Id of the tag. | [optional] 
**created_time** | **int** | Creation date in epoch format. | [optional] 

## Example

```python
from pinterestsdk.models.conversion_event_response import ConversionEventResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEventResponse from a JSON string
conversion_event_response_instance = ConversionEventResponse.from_json(json)
# print the JSON string representation of the object
print(ConversionEventResponse.to_json())

# convert the object into a dict
conversion_event_response_dict = conversion_event_response_instance.to_dict()
# create an instance of ConversionEventResponse from a dict
conversion_event_response_from_dict = ConversionEventResponse.from_dict(conversion_event_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


