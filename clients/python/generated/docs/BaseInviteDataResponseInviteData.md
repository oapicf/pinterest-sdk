# BaseInviteDataResponseInviteData

Metadata for the invite/request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_expiration** | **int** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] 
**invite_status** | **str** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] 
**invite_type** | **str** | The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] 
**last_updated_time** | **int** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] 
**sent_at** | **int** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] 

## Example

```python
from pinterestsdk.models.base_invite_data_response_invite_data import BaseInviteDataResponseInviteData

# TODO update the JSON string below
json = "{}"
# create an instance of BaseInviteDataResponseInviteData from a JSON string
base_invite_data_response_invite_data_instance = BaseInviteDataResponseInviteData.from_json(json)
# print the JSON string representation of the object
print(BaseInviteDataResponseInviteData.to_json())

# convert the object into a dict
base_invite_data_response_invite_data_dict = base_invite_data_response_invite_data_instance.to_dict()
# create an instance of BaseInviteDataResponseInviteData from a dict
base_invite_data_response_invite_data_from_dict = BaseInviteDataResponseInviteData.from_dict(base_invite_data_response_invite_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


