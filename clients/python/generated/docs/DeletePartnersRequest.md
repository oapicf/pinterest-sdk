# DeletePartnersRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partner_ids** | **List[str]** |  | 
**partner_type** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.delete_partners_request import DeletePartnersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeletePartnersRequest from a JSON string
delete_partners_request_instance = DeletePartnersRequest.from_json(json)
# print the JSON string representation of the object
print(DeletePartnersRequest.to_json())

# convert the object into a dict
delete_partners_request_dict = delete_partners_request_instance.to_dict()
# create an instance of DeletePartnersRequest from a dict
delete_partners_request_from_dict = DeletePartnersRequest.from_dict(delete_partners_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


