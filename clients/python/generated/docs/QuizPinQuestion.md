# QuizPinQuestion

A specific quiz inquiry.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**options** | [**List[QuizPinOption]**](QuizPinOption.md) |  | [optional] 
**question_id** | **float** |  | [optional] 
**question_text** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.quiz_pin_question import QuizPinQuestion

# TODO update the JSON string below
json = "{}"
# create an instance of QuizPinQuestion from a JSON string
quiz_pin_question_instance = QuizPinQuestion.from_json(json)
# print the JSON string representation of the object
print(QuizPinQuestion.to_json())

# convert the object into a dict
quiz_pin_question_dict = quiz_pin_question_instance.to_dict()
# create an instance of QuizPinQuestion from a dict
quiz_pin_question_from_dict = QuizPinQuestion.from_dict(quiz_pin_question_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


