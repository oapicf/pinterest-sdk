# QuizPinOption

 This field contains multiple options to a quiz question.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **float** |  | [optional] 
**text** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.quiz_pin_option import QuizPinOption

# TODO update the JSON string below
json = "{}"
# create an instance of QuizPinOption from a JSON string
quiz_pin_option_instance = QuizPinOption.from_json(json)
# print the JSON string representation of the object
print(QuizPinOption.to_json())

# convert the object into a dict
quiz_pin_option_dict = quiz_pin_option_instance.to_dict()
# create an instance of QuizPinOption from a dict
quiz_pin_option_from_dict = QuizPinOption.from_dict(quiz_pin_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


