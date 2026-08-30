# ConversionDeletionRequestCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deletion_targets** | [**ConversionDeletionRequestTargets**](ConversionDeletionRequestTargets.md) | Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. | 

## Example

```python
from openapi_client.models.conversion_deletion_request_create import ConversionDeletionRequestCreate

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionDeletionRequestCreate from a JSON string
conversion_deletion_request_create_instance = ConversionDeletionRequestCreate.from_json(json)
# print the JSON string representation of the object
print ConversionDeletionRequestCreate.to_json()

# convert the object into a dict
conversion_deletion_request_create_dict = conversion_deletion_request_create_instance.to_dict()
# create an instance of ConversionDeletionRequestCreate from a dict
conversion_deletion_request_create_from_dict = ConversionDeletionRequestCreate.from_dict(conversion_deletion_request_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


