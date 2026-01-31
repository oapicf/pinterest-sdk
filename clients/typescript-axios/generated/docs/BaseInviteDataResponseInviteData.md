# BaseInviteDataResponseInviteData

Metadata for the invite/request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_expiration** | **number** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] [default to undefined]
**invite_status** | **string** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] [default to undefined]
**invite_type** | **string** | The type of invite. &lt;br&gt;\&#39;MEMBER_INVITE\&#39; is to invite a member to access your business assets. &lt;br&gt;\&#39;PARTNER_INVITE\&#39; is to invite a partner to access your business assets. &lt;br&gt;\&#39;PARTNER_REQUEST\&#39; is to request access a partner\&#39;s business assets. | [optional] [default to undefined]
**last_updated_time** | **number** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] [default to undefined]
**sent_at** | **number** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] [default to undefined]

## Example

```typescript
import { BaseInviteDataResponseInviteData } from './api';

const instance: BaseInviteDataResponseInviteData = {
    invite_expiration,
    invite_status,
    invite_type,
    last_updated_time,
    sent_at,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
