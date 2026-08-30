# BaseInviteDataResponse

Common invite/request data returned by the business access endpoints.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of the invite/request. | [optional] 
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] 
**is_received_invite** | **bool** | Indicates whether the invite/request was received. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Example

```python
from pinterestsdk.models.base_invite_data_response import BaseInviteDataResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BaseInviteDataResponse from a JSON string
base_invite_data_response_instance = BaseInviteDataResponse.from_json(json)
# print the JSON string representation of the object
print(BaseInviteDataResponse.to_json())

# convert the object into a dict
base_invite_data_response_dict = base_invite_data_response_instance.to_dict()
# create an instance of BaseInviteDataResponse from a dict
base_invite_data_response_from_dict = BaseInviteDataResponse.from_dict(base_invite_data_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


