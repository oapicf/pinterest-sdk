# InviteDataResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**InviteExpiration** | **Int32** | The date and time when the invite/request will expire. Returned in milliseconds. | [optional] 
**InviteStatus** | **String** | The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. | [optional] 
**InviteType** | **String** | The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets. | [optional] 
**LastUpdatedTime** | **Int32** | The date and time the invite/request was last updated. Returned in milliseconds. | [optional] 
**SentAt** | **Int32** | The date and time the invite/request was sent/created. Returned in milliseconds. | [optional] 

## Examples

- Prepare the resource
```powershell
$InviteDataResponse = Initialize-PSOpenAPIToolsInviteDataResponse  -InviteExpiration null `
 -InviteStatus null `
 -InviteType null `
 -LastUpdatedTime null `
 -SentAt null
```

- Convert the resource to JSON
```powershell
$InviteDataResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

