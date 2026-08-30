# ConversionDeletionRequestEPIKTargets


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**epiks** | **List[str]** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). | 

## Example

```python
from openapi_client.models.conversion_deletion_request_epik_targets import ConversionDeletionRequestEPIKTargets

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionDeletionRequestEPIKTargets from a JSON string
conversion_deletion_request_epik_targets_instance = ConversionDeletionRequestEPIKTargets.from_json(json)
# print the JSON string representation of the object
print ConversionDeletionRequestEPIKTargets.to_json()

# convert the object into a dict
conversion_deletion_request_epik_targets_dict = conversion_deletion_request_epik_targets_instance.to_dict()
# create an instance of ConversionDeletionRequestEPIKTargets from a dict
conversion_deletion_request_epik_targets_from_dict = ConversionDeletionRequestEPIKTargets.from_dict(conversion_deletion_request_epik_targets_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


