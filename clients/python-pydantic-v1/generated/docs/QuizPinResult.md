# QuizPinResult

The result, and link out, based on the user’s choice.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**android_deep_link** | **str** |  | [optional] 
**destination_url** | **str** |  | [optional] 
**ios_deep_link** | **str** |  | [optional] 
**organic_pin_id** | **str** |  | [optional] 
**result_id** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.quiz_pin_result import QuizPinResult

# TODO update the JSON string below
json = "{}"
# create an instance of QuizPinResult from a JSON string
quiz_pin_result_instance = QuizPinResult.from_json(json)
# print the JSON string representation of the object
print QuizPinResult.to_json()

# convert the object into a dict
quiz_pin_result_dict = quiz_pin_result_instance.to_dict()
# create an instance of QuizPinResult from a dict
quiz_pin_result_from_dict = QuizPinResult.from_dict(quiz_pin_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


