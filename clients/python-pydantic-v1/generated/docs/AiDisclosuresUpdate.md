# AiDisclosuresUpdate

AI disclosure declarations the creator has made about the Pin.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**values** | [**List[AiDisclosureItem]**](AiDisclosureItem.md) | List of AI disclosure declarations the creator has made about this Pin. | [optional] 

## Example

```python
from openapi_client.models.ai_disclosures_update import AiDisclosuresUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of AiDisclosuresUpdate from a JSON string
ai_disclosures_update_instance = AiDisclosuresUpdate.from_json(json)
# print the JSON string representation of the object
print AiDisclosuresUpdate.to_json()

# convert the object into a dict
ai_disclosures_update_dict = ai_disclosures_update_instance.to_dict()
# create an instance of AiDisclosuresUpdate from a dict
ai_disclosures_update_from_dict = AiDisclosuresUpdate.from_dict(ai_disclosures_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


