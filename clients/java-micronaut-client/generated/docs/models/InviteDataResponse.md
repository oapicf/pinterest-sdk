

# InviteDataResponse

Metadata for the invite/request.

The class is defined in **[InviteDataResponse.java](../../src/main/java/org/openapitools/model/InviteDataResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inviteExpiration** | `Integer` | The date and time when the invite/request will expire. Returned in milliseconds. |  [optional property]
**inviteStatus** | `String` | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. |  [optional property]
**inviteType** | `String` | The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. |  [optional property]
**lastUpdatedTime** | `Integer` | The date and time the invite/request was last updated. Returned in milliseconds. |  [optional property]
**sentAt** | `Integer` | The date and time the invite/request was sent/created. Returned in milliseconds. |  [optional property]







