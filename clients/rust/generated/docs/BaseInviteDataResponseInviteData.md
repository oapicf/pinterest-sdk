# BaseInviteDataResponseInviteData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_expiration** | Option<**i32**> | The date and time when the invite/request will expire. Returned in milliseconds. | [optional]
**invite_status** | Option<**String**> | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional]
**invite_type** | Option<**String**> | The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets. | [optional]
**last_updated_time** | Option<**i32**> | The date and time the invite/request was last updated. Returned in milliseconds. | [optional]
**sent_at** | Option<**i32**> | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


