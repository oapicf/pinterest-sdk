# SharedAudience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | 
**operation_type** | [**OperationType**](OperationType.md) |  | 
**recipient_account_ids** | **List[str]** | List of ad account IDs to share with or revoke from. | 

## Example

```python
from pinterestsdk.models.shared_audience import SharedAudience

# TODO update the JSON string below
json = "{}"
# create an instance of SharedAudience from a JSON string
shared_audience_instance = SharedAudience.from_json(json)
# print the JSON string representation of the object
print(SharedAudience.to_json())

# convert the object into a dict
shared_audience_dict = shared_audience_instance.to_dict()
# create an instance of SharedAudience from a dict
shared_audience_from_dict = SharedAudience.from_dict(shared_audience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


