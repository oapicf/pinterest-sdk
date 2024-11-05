# BASE_INVITE_DATA_RESPONSE_INVITE_DATA

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_expiration** | **INTEGER_32** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] [default to null]
**invite_status** | [**STRING_32**](STRING_32.md) | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] [default to null]
**invite_type** | [**STRING_32**](STRING_32.md) | The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] [default to null]
**last_updated_time** | **INTEGER_32** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] [default to null]
**sent_at** | **INTEGER_32** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


