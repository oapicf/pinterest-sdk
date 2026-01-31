# BusinessSharedAudience


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Unique identifier of an audience | 
**operation_type** | [**OperationType**](OperationType.md) |  | 
**recipient_business_ids** | **List[str]** | List of business IDs to share with or revoke from. | 

## Example

```python
from pinterestsdk.models.business_shared_audience import BusinessSharedAudience

# TODO update the JSON string below
json = "{}"
# create an instance of BusinessSharedAudience from a JSON string
business_shared_audience_instance = BusinessSharedAudience.from_json(json)
# print the JSON string representation of the object
print(BusinessSharedAudience.to_json())

# convert the object into a dict
business_shared_audience_dict = business_shared_audience_instance.to_dict()
# create an instance of BusinessSharedAudience from a dict
business_shared_audience_from_dict = BusinessSharedAudience.from_dict(business_shared_audience_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


