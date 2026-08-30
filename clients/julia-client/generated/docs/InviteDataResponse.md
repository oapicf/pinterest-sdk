# InviteDataResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`invite_expiration`** | **`Int64`** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] [default to nothing]
**`invite_status`** | **`String`** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] [default to nothing]
**`invite_type`** | **`String`** | The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] [default to nothing]
**`last_updated_time`** | **`Int64`** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] [default to nothing]
**`sent_at`** | **`Int64`** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


