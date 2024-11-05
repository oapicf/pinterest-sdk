# Org.OpenAPITools.Model.BaseInviteDataResponseInviteData
Metadata for the invite/request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteExpiration** | **int** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] 
**InviteStatus** | **string** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] 
**InviteType** | **string** | The type of invite. &lt;br&gt;&#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. &lt;br&gt;&#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. &lt;br&gt;&#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] 
**LastUpdatedTime** | **int** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] 
**SentAt** | **int** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

