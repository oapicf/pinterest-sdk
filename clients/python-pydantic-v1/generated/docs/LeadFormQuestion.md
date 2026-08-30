# LeadFormQuestion


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_question_field_type** | [**LeadFormQuestionFieldType**](LeadFormQuestionFieldType.md) |  | [optional] 
**custom_question_label** | **str** | Question label for a custom question. | [optional] 
**custom_question_options** | **List[str]** | Question options for a custom question. | [optional] 
**question_type** | [**LeadFormQuestionType**](LeadFormQuestionType.md) |  | [optional] 

## Example

```python
from openapi_client.models.lead_form_question import LeadFormQuestion

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormQuestion from a JSON string
lead_form_question_instance = LeadFormQuestion.from_json(json)
# print the JSON string representation of the object
print LeadFormQuestion.to_json()

# convert the object into a dict
lead_form_question_dict = lead_form_question_instance.to_dict()
# create an instance of LeadFormQuestion from a dict
lead_form_question_from_dict = LeadFormQuestion.from_dict(lead_form_question_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


