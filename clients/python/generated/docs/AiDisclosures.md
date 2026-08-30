# AiDisclosures

AI disclosure declarations the creator has made about the Pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List[AiDisclosureItem]**](AiDisclosureItem.md) | List of AI disclosure declarations the creator has made about this Pin. | 

## Example

```python
from pinterestsdk.models.ai_disclosures import AiDisclosures

# TODO update the JSON string below
json = "{}"
# create an instance of AiDisclosures from a JSON string
ai_disclosures_instance = AiDisclosures.from_json(json)
# print the JSON string representation of the object
print(AiDisclosures.to_json())

# convert the object into a dict
ai_disclosures_dict = ai_disclosures_instance.to_dict()
# create an instance of AiDisclosures from a dict
ai_disclosures_from_dict = AiDisclosures.from_dict(ai_disclosures_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


