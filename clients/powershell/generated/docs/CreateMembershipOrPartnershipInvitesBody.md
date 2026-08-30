# CreateMembershipOrPartnershipInvitesBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BusinessRole** | [**BusinessRoleForInvite**](BusinessRoleForInvite.md) |  | 
**InviteType** | [**InviteType**](InviteType.md) |  | 
**Members** | **String[]** | A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE | [optional] 
**Partners** | **String[]** | A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST | [optional] 

## Examples

- Prepare the resource
```powershell
$CreateMembershipOrPartnershipInvitesBody = Initialize-PSOpenAPIToolsCreateMembershipOrPartnershipInvitesBody  -BusinessRole BIZ_ADMIN `
 -InviteType null `
 -Members [&quot;business0101&quot;,&quot;user@business.com&quot;] `
 -Partners [&quot;809944451643622187&quot;,&quot;766456567741825556&quot;]
```

- Convert the resource to JSON
```powershell
$CreateMembershipOrPartnershipInvitesBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

