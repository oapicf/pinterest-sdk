# DeletePartnersResponse

An object with a list of partners that were deleted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deleted_partners** | **List[str]** | List of partners whose business partnership have been terminated. | [optional] 

## Example

```python
from pinterestsdk.models.delete_partners_response import DeletePartnersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnersResponse from a JSON string
delete_partners_response_instance = DeletePartnersResponse.from_json(json)
# print the JSON string representation of the object
print(DeletePartnersResponse.to_json())

# convert the object into a dict
delete_partners_response_dict = delete_partners_response_instance.to_dict()
# create an instance of DeletePartnersResponse from a dict
delete_partners_response_from_dict = DeletePartnersResponse.from_dict(delete_partners_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


