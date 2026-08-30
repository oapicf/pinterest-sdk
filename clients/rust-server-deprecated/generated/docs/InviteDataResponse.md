# InviteDataResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_expiration** | **i32** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] [default to None]
**invite_status** | **String** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] [default to None]
**invite_type** | **String** | The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets. | [optional] [default to None]
**last_updated_time** | **i32** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] [default to None]
**sent_at** | **i32** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


