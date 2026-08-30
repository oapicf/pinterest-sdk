# QuizPinData

This field includes all quiz data including questions, options, and results.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**questions** | [**List[QuizPinQuestion]**](QuizPinQuestion.md) |  | [optional] 
**results** | [**List[QuizPinResult]**](QuizPinResult.md) |  | [optional] 
**tie_breaker_custom_result** | [**QuizPinResult**](QuizPinResult.md) |  | [optional] 
**tie_breaker_type** | [**TieBreakerType**](TieBreakerType.md) |  | [optional] 

## Example

```python
from openapi_client.models.quiz_pin_data import QuizPinData

# TODO update the JSON string below
json = "{}"
# create an instance of QuizPinData from a JSON string
quiz_pin_data_instance = QuizPinData.from_json(json)
# print the JSON string representation of the object
print QuizPinData.to_json()

# convert the object into a dict
quiz_pin_data_dict = quiz_pin_data_instance.to_dict()
# create an instance of QuizPinData from a dict
quiz_pin_data_from_dict = QuizPinData.from_dict(quiz_pin_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


